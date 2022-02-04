package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/", "/index", "/home"}) //Un método puede estar mapeado a más de una ruta URL
	public String index() {
		return "index";//index.html
	}

}
