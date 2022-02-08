package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {
	
	@GetMapping("/")
	public String home() {
		//return "redirect:/app/index";//La ruta URL cambia
		return "forward:/app/index";//La ruta URL no cambia
	}

}
