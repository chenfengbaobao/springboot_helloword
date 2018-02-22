package com.how2java.springboot.web;
/**
 *	@author:辰
 *	@E-mail:15538323378@163.com
 *	@CSDN博客：http://blog.csdn.net/chenfengbao
 *   @weixin:wuhaifeng1613
 *   @qq: 1648269848@qq.com
 *	@2018年2月7日下午4:10:40
 */

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
    
    	m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
    	
    	String dString = DateFormat.getDateTimeInstance().format(new Date());
    	
    	if(true){
            throw new Exception("some exception");
        }
        return "hello";
    }
 
}