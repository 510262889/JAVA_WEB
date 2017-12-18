package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/test.action")  
	public void test(){
		System.out.println("aaa");
	}
}
