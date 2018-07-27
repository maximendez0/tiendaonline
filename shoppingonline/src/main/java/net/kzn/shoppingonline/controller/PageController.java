package net.kzn.shoppingonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "inicio");
		mv.addObject("userClickHome", true);
		return mv;
	}
	@RequestMapping(value = { "/serviciotecnico"})
	public ModelAndView serviciotecnico() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "servicio tecnico");
		mv.addObject("userClickServicioTecnico", true);
		return mv;
	}
	@RequestMapping(value = { "/productos"})
	public ModelAndView productos() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "productos");
		mv.addObject("userClickProductos", true);
		return mv;
	}
	@RequestMapping(value = { "/contacto"})
	public ModelAndView contacto() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "contacto");
		mv.addObject("userClickContacto", true);
		return mv;
	}



}
