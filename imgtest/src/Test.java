import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Test {
	public static void main(String[] args) throws IOException {
		String path = "C:/Users/wang_/Desktop/web/1.png"; // 输入图片 测试要在C盘放一张图片1.jpg

		ImgUtils.scale(path, "D:/img/1-1.jpg", 100, 200, true);// 等比例缩放 输出缩放图片

		File newfile = new File(path);
		BufferedImage bufferedimage = ImageIO.read(newfile);
		int width = bufferedimage.getWidth();
		int height = bufferedimage.getHeight();
		// 目标将图片裁剪成 宽240，高160
		if (width > 240) {
			/* 开始x坐标 开始y坐标 结束x坐标 结束y坐标 */
			bufferedimage = ImgUtils.cropImage(bufferedimage, (int) ((width - 240) / 2), 0,
					(int) (width - (width - 240) / 2), (int) (height));
			if (height > 160) {
				bufferedimage = ImgUtils.cropImage(bufferedimage, 0, (int) ((height - 160) / 2), 240,
						(int) (height - (height - 160) / 2));
			}
		} else {
			if (height > 160) {
				bufferedimage = ImgUtils.cropImage(bufferedimage, 0, (int) ((height - 160) / 2), (int) (width),
						(int) (height - (height - 160) / 2));
			}
		}
		ImageIO.write(bufferedimage, "jpg", new File("D:/img/1-2.jpg")); // 输出裁剪图片
	
	
		try {
			//等比压缩，效果可用
			ImgUtils.Thumbnail(path, "D:/img/1-3.jpg", 100, 200, 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		ImgUtils.zipImageFile(path, "D:/img/1-4.jpg",100, 200, 100);
		
		//按输入压缩，效果可用
		ImgUtils.zipWidthHeightImageFile(path, "D:/img/1-5.jpg",150, 200, 100);
	}
	
	
}
