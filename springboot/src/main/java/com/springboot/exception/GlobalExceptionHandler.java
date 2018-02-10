/**
 * 
 */
package com.springboot.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot.common.bean.ApiResult;
import com.springboot.common.bean.ResultCode;
import com.springboot.common.bean.ResultMessage;

/**
 * @ClassName: GlobalExceptionHandler 
 * @Description: 在执行@RequestMapping时，进入逻辑处理阶段前。譬如传的参数类型错误
 * @author shuyu.wang
 * @date 2018年1月25日 下午3:12:16 
 * @version V1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

    /**
     * 处理@RequestParam错误, 即参数不足
     * @return
     */
    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<Object>(new ApiResult(ResultCode.PARAM_ERROR.getCode(),ResultMessage.PARAM_ERROR.getMessage()), status);
    }

    /**
     * 500
     * 请求方式不支持
     */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<Object>(new ApiResult(ResultCode.METHOD_NOT_ALLOWED.getCode(),ResultMessage.METHOD_NOT_ALLOWED.getMessage()), status);

    }

}
