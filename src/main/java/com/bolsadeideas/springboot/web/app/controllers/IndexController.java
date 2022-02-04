package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/", "/index", "/home"}) //Un método puede estar mapeado a más de una ruta URL
	public String index(Model model) {
		model.addAttribute("titulo", "Hello Spring Framework From Controller");
		return "index";//index.html
	}

}
