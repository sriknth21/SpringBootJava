package com.example.Spring.Boot.Java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/Hello/")
	public String Hello(){
		return "Hi Everyone";
	}
}
