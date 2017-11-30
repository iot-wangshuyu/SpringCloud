import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * @ClassName: ImgUtils
 * @Description: 裁剪、缩放图片工具类
 * @author shuyu.wang
 * @date 2017年10月31日 上午10:06:14
 * @version V1.0
 */
public class ImgUtils {
	/**
	 * 缩放图片方法
	 * 
	 * @param srcImageFile
	 *            要缩放的图片路径
	 * @param result
	 *            缩放后的图片路径
	 * @param height
	 *            目标高度像素
	 * @param width
	 *            目标宽度像素
	 * @param bb
	 *            是否补白
	 */
	public final static void scale(String srcImageFile, String result, int height, int width, boolean bb) {
		try {
			double ratio = 0.0; // 缩放比例
			File f = new File(srcImageFile);
			BufferedImage bi = ImageIO.read(f);
			Image itemp = bi.getScaledInstance(width, height, bi.SCALE_SMOOTH);// bi.SCALE_SMOOTH
																				// 选择图像平滑度比缩放速度具有更高优先级的图像缩放算法。
			// 计算比例
			if ((bi.getHeight() > height) || (bi.getWidth() > width)) {
				double ratioHeight = (new Integer(height)).doubleValue() / bi.getHeight();
				double ratioWhidth = (new Integer(width)).doubleValue() / bi.getWidth();
				if (ratioHeight > ratioWhidth) {
					ratio = ratioHeight;
				} else {
					ratio = ratioWhidth;
				}
				AffineTransformOp op = new AffineTransformOp(AffineTransform// 仿射转换
						.getScaleInstance(ratio, ratio), null);// 返回表示剪切变换的变换
				itemp = op.filter(bi, null);// 转换源 BufferedImage 并将结果存储在目标 BufferedImage 中。
			}
			if (bb) {// 补白
				BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);// 构造一个类型为预定义图像类型之一的
																									// BufferedImage。
				Graphics2D g = image.createGraphics();// 创建一个 Graphics2D，可以将它绘制到此 BufferedImage 中。
				g.setColor(Color.white);// 控制颜色
				g.fillRect(0, 0, width, height);// 使用 Graphics2D 上下文的设置，填充 Shape 的内部区域。
				if (width == itemp.getWidth(null))
					g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2, itemp.getWidth(null),
							itemp.getHeight(null), Color.white, null);
				else
					g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0, itemp.getWidth(null),
							itemp.getHeight(null), Color.white, null);
				g.dispose();
				itemp = image;
			}
			ImageIO.write((BufferedImage) itemp, "JPEG", new File(result)); // 输出压缩图片
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 裁剪图片方法
	 * 
	 * @param bufferedImage
	 *            图像源
	 * @param startX
	 *            裁剪开始x坐标
	 * @param startY
	 *            裁剪开始y坐标
	 * @param endX
	 *            裁剪结束x坐标
	 * @param endY
	 *            裁剪结束y坐标
	 * @return
	 */
	public static BufferedImage cropImage(BufferedImage bufferedImage, int startX, int startY, int endX, int endY) {
		int width = bufferedImage.getWidth();
		int height = bufferedImage.getHeight();
		if (startX == -1) {
			startX = 0;
		}
		if (startY == -1) {
			startY = 0;
		}
		if (endX == -1) {
			endX = width - 1;
		}
		if (endY == -1) {
			endY = height - 1;
		}
		BufferedImage result = new BufferedImage(endX - startX, endY - startY, 4);
		for (int x = startX; x < endX; ++x) {
			for (int y = startY; y < endY; ++y) {
				int rgb = bufferedImage.getRGB(x, y);
				result.setRGB(x - startX, y - startY, rgb);
			}
		}
		return result;
	}

	/**
	 * 等比例缩放图片
	 * 
	 * @param infile
	 * @param outfile
	 * @param width
	 * @param height
	 * @param quality
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void Thumbnail(String infile, String outfile, int width, int height, int quality)
			throws IOException, InterruptedException {
		// save thumbnail image to OUTFILE
		// System.out.println("infile:" + infile);
		BufferedImage thumbImage = null;
		BufferedOutputStream out = null;
		Image image = null;
		image = Toolkit.getDefaultToolkit().createImage(infile);
		MediaTracker mediaTracker = new MediaTracker(new Container());
		mediaTracker.addImage(image, 0);
		mediaTracker.waitForID(0);
		int thumbWidth = width;
		int thumbHeight = height;
		double thumbRatio = (double) thumbWidth / (double) thumbHeight;
		int imageWidth = image.getWidth(null);
		int imageHeight = image.getHeight(null);
		double imageRatio = (double) imageWidth / (double) imageHeight;
		if (thumbRatio < imageRatio) {
			thumbHeight = (int) (thumbWidth / imageRatio);
		} else {
			thumbWidth = (int) (thumbHeight * imageRatio);
		}
		thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D = thumbImage.createGraphics();
		graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics2D.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);
		out = new BufferedOutputStream(new FileOutputStream(outfile));
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(thumbImage);
		quality = Math.max(0, Math.min(quality, 100));
		param.setQuality((float) quality / 100.0f, false);
		encoder.setJPEGEncodeParam(param);
		encoder.encode(thumbImage);
		out.close();
		thumbImage = null;
		out = null;
		image = null;
	}

	/**
	 * @return
	 * @作者 王建明
	 * @创建日期 2012-8-2
	 * @创建时间 下午02:00:41
	 * @描述 —— 生成随机名字，不可能重复(用于文件的命名)
	 */
	public static String getRandomName() {
		Random r = new Random();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		StringBuffer sb = new StringBuffer();
		sb.append(r.nextInt(100));
		sb.append(r.nextInt(100));
		sb.append("_");
		sb.append(sdf.format(new Date()));
		sb.append("_");
		sb.append(r.nextInt(100));
		sb.append(r.nextInt(100));
		return sb.toString();
	}

	/**
	 * 根据设置的宽高等比例压缩图片文件<br>
	 * 先保存原文件，再压缩、上传
	 * 
	 * @param oldFile
	 *            要进行压缩的文件
	 * @param newFile
	 *            新文件
	 * @param width
	 *            宽度 //设置宽度时（高度传入0，等比例缩放）
	 * @param height
	 *            高度 //设置高度时（宽度传入0，等比例缩放）
	 * @param quality
	 *            质量
	 * @return 返回压缩后的文件的全路径
	 */
	public static String zipImageFile(String path,String srcImgPath, int width, int height, float quality) {
		File oldFile = new File(path);
		if (oldFile == null) {
			return null;
		}
		try {
			/** 对服务器上的临时文件进行处理 */
			Image srcFile = ImageIO.read(oldFile);
			int w = srcFile.getWidth(null);
			int h = srcFile.getHeight(null);
			double bili;
			if (width > 0) {
				bili = width / (double) w;
				height = (int) (h * bili);
			} else {
				if (height > 0) {
					bili = height / (double) h;
					width = (int) (w * bili);
				}
			}

//			String srcImgPath = newFile.getAbsoluteFile().toString();
			System.out.println(srcImgPath);
			String subfix = "jpg";
			subfix = srcImgPath.substring(srcImgPath.lastIndexOf(".") + 1, srcImgPath.length());

			BufferedImage buffImg = null;
			if (subfix.equals("png")) {
				buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			} else {
				buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			}

			Graphics2D graphics = buffImg.createGraphics();
			graphics.setBackground(new Color(255, 255, 255));
			graphics.setColor(new Color(255, 255, 255));
			graphics.fillRect(0, 0, width, height);
			graphics.drawImage(srcFile.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);

			ImageIO.write(buffImg, subfix, new File(srcImgPath));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return srcImgPath;
	}

	/**
	 * 按设置的宽度高度压缩图片文件<br>
	 * 先保存原文件，再压缩、上传
	 * 
	 * @param oldFile
	 *            要进行压缩的文件全路径
	 * @param newFile
	 *            新文件
	 * @param width
	 *            宽度
	 * @param height
	 *            高度
	 * @param quality
	 *            质量
	 * @return 返回压缩后的文件的全路径
	 */
	public static String zipWidthHeightImageFile(String path, String srcImgPath, int width, int height, float quality) {
		if (path == null) {
			return null;
		}
		File oldFile = new File(path);
		String newImage = null;
		try {
			/** 对服务器上的临时文件进行处理 */
			Image srcFile = ImageIO.read(oldFile);

//			String srcImgPath = newFile.getAbsoluteFile().toString();
			System.out.println(srcImgPath);
			String subfix = "jpg";
			subfix = srcImgPath.substring(srcImgPath.lastIndexOf(".") + 1, srcImgPath.length());

			BufferedImage buffImg = null;
			if (subfix.equals("png")) {
				buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			} else {
				buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			}

			Graphics2D graphics = buffImg.createGraphics();
			graphics.setBackground(new Color(255, 255, 255));
			graphics.setColor(new Color(255, 255, 255));
			graphics.fillRect(0, 0, width, height);
			graphics.drawImage(srcFile.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);

			ImageIO.write(buffImg, subfix, new File(srcImgPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newImage;
	}
}
