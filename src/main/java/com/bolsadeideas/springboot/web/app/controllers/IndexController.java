package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "", "/", "/index", "/home" }) // Un método puede estar mapeado a más de una ruta URL
	public String index(Model model) {
		model.addAttribute("titulo", "Hello Spring Framework From Controller");
		return "index";// index.html
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Martín");
		usuario.setApellido("Díaz");
		usuario.setEmail("magadiflo@gmail.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");

		return "listar";
	}

	/*
	 * Otra forma de pasar datos a la vista, pero estos datos estarán en todas las
	 * vistas de este controlador. Es decir, será común a todos los métodos de 
	 * este controlador
	 */
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Martín", "Díaz", "magadiflo@gmail.com"));
		usuarios.add(new Usuario("Gaspar", "Flores", "gaspar@gmail.com"));
		usuarios.add(new Usuario("Alicia", "Zúñiga", "alivioflozu@gmail.com"));
		usuarios.add(new Usuario("Tinkler", "Díaz", "tinkler@gmail.com"));
		return usuarios;
	}

}
