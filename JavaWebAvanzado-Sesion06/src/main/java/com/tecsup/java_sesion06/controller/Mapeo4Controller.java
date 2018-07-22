package com.tecsup.java_sesion06.controller;

//prueba branch 2
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ejercicio4")
public class Mapeo4Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mapeo4Controller.class);

	@RequestMapping(method = RequestMethod.GET)
	public String cargar() {
		
		logger.info("Redireccionando a ejercicio1.html");

		return "redirect:ejercicio1.html";
	}
	
	
}
	
