package com.cfjst.piggy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 通用请求
 */


@Controller
public class IndexController {

	@RequestMapping("/")
	public String login()  {
		return "index";
	}
	 
	
}
