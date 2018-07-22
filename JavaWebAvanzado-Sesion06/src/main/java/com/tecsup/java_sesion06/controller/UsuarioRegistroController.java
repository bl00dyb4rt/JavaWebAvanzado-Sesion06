package com.tecsup.java_sesion06.controller;

import org.owasp.encoder.Encode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.tecsup.java_sesion06.modelo.Usuario;

@Controller
@RequestMapping("/registro")
public class UsuarioRegistroController {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioRegistroController.class);

	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView modelAndView = 
				new ModelAndView("registro/formulario", "usuario", new Usuario());

		return modelAndView;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("usuario") Usuario usuario, ModelMap model) {
		logger.info(usuario.toString());
		

		model.addAttribute("cuenta", Encode.forHtml(usuario.getCuenta()));
		model.addAttribute("clave", Encode.forHtml(usuario.getClave()));
		model.addAttribute("direccion", Encode.forHtml(usuario.getDireccion()));
		logger.info(usuario.toString());
		return "registro/resultado";
	}
}
