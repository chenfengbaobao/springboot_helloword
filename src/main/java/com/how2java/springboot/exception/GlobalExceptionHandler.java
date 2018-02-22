package com.how2java.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author:辰
 * @E-mail:15538323378@163.com
 * @CSDN博客：http://blog.csdn.net/chenfengbao
 * @weixin:wuhaifeng1613
 * @qq: 1648269848@qq.com
 * @2018年2月7日下午4:52:10 
 * 新增加一个类GlobalExceptionHandler，用于捕捉Exception异常以及其子类。
 * 捕捉到之后，把异常信息，发出一场的地址放进ModelAndView里，然后跳转到 errorPage.jsp
 */

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e){
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName("errorPage");
		return mav;
		}

}
