package com.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import com.springboot.common.bean.ApiResult;
import com.springboot.common.bean.ResultCode;
import com.springboot.common.bean.ResultMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @ClassName: GlobalDefaultExceptionHandler
 * @Description: 异常集中处理，更好的使业务逻辑与异常处理剥离开
 * @author shuyu.wang
 * @date 2017年11月23日 上午9:45:16
 * @version V1.0
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	/**
	 * @Title: defaultErrorHandler 
	 * @Description: 统一处理某一类异常，从而能够减少代码重复率和复杂度
	 * @param req 
	 * @param e 
	 * @return ApiResult 
	 * @throws
	 */
	@ExceptionHandler(value = ExceptionResult.class)
	@ResponseBody
	public ApiResult defaultErrorHandler(HttpServletRequest req, Exception ex) {
		// 打印异常信息：
		ex.printStackTrace();
		return new ApiResult(ResultCode.SERVER_ERROR.getCode(), ResultMessage.SERVER_ERRPR.getMessage(),ex.toString(),null);

	} 

	/**
	 * 捕获类内所有的异常
	 * 
	 * @param ex
	 * @return
	 */
//	@ExceptionHandler(value = Exception.class)
//	public ModelAndView exceptionHandelByThymeleaf(Exception ex, HttpServletRequest req) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("error");
//		mav.addObject("exception", ex.getMessage());
//		mav.addObject("url", req.getRequestURL());
//		return mav;
//	}

}
