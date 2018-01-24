package com.springboot.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springboot.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * 描述:自定义拦截器
 * @author myx
 * @date 2017年7月10日 下午1:37:39
 */

public class MyInterceptor implements HandlerInterceptor{
	@Autowired
	private RedisService redisService;

	/**
	 * 在请求处理之前进行调用（Controller方法调用之前）
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @return 只有返回true才会继续向下执行，返回false取消当前请求
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = true;
		response.setHeader("Access-Control-Allow-Origin", "*");
		String url = request.getRequestURL().toString();
		String token = request.getParameter("token");
		System.out.println("redisService" + redisService);
		/*if (CommonUtil.isNotNullEmpty(token)) {
			if (!url.endsWith("user")) {
				// String zh = RedisUtils.get(token);
				String zh = redisService.getUserId(token);
				// RedisUtils.expire(token, 6000);
				System.out.println("用户名：" + zh);
				if (zh == null || "".equals(zh)) {// token失效
					response.setContentType("text/json;charset=UTF-8");
					ApiResult result = new ApiResult(10, "登录超时，请重新登录！", null, null);
					PrintWriter out = response.getWriter();
					out.write(GsonUtil.GsonString(result));
					out.close();
					return false;
				}
				redisService.validate(token);
			}

		} else {
			response.setContentType("text/json;charset=UTF-8");
			ApiResult result = new ApiResult(10, "token不能为空！", null, null);
			PrintWriter out = response.getWriter();
			out.write(GsonUtil.GsonString(result));
			out.close();
			return false;
		}*/
		return flag;
	}

	/**
	 * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse, java.lang.Object,
	 *      org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
						   ModelAndView modelAndView) throws Exception {

	}

	/**
	 * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse, java.lang.Object,
	 *      java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
								Exception ex) throws Exception {

	}

}
