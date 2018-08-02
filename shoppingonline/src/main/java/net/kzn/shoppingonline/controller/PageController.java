package net.kzn.shoppingonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kdz.shoppingbackend.dao.CategoryDAO;
import net.kdz.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "inicio");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
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
	
	@RequestMapping(value = { "/contacto"})
	public ModelAndView contacto() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "contacto");
		mv.addObject("userClickContacto", true);
		return mv;
	}
	// method to load all the products and based on categories
	
	@RequestMapping(value = {"show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "productos");
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	@RequestMapping(value = { "show/category/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		//categoryDAO to fetch single category
		Category category=null;
		category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		//passing the single category
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}



}
