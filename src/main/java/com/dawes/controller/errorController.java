package com.dawes.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

public class errorController implements ErrorController {
	  @RequestMapping("/error")
	  @ResponseBody
	  String error(HttpServletRequest request) {
	    return "<h1>Error occurred</h1>";
	  }
	  public String getErrorPath() {
	    return "/error";
	  }
}
