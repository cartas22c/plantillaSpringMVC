package com.capgemini.springanotaciones.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	private String texto = "Texto de prueba para mi primer controlador";

	private final Logger LOGGER = Logger.getLogger(HomeController.class.getName());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		LOGGER.log(Level.INFO, "Dentro del primerTest mapeado como homeController"); 
 		return new ModelAndView("home", "mensaje", texto);
	}

}
