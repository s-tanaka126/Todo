package com.todo.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class Helloworld {
	
	@GetMapping({"/"})
	public String hello() {
		
		return "/hello";
	}

}
