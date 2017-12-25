package com.project.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.project.app.dao.ProductDAO;
import com.project.app.entity.Product;
 
@Controller
public class IndexController {
 
	/*@Autowired
	private ProductDAO products;*/
	
	 @GetMapping(value="/")
	public String login(Model model) {
		/*List<Product> products = this.products.getProducts();
		model.addAttribute("products", products);*/
		return "login";
	}
}