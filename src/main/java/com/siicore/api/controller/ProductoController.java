package com.siicore.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siicore.api.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	/*@GetMapping("/")
	public String listar(Model model) {
		model.addAttribute("productos", productoService.listarTodo());
		return "/views/productos/table";
	}*/
	
	@GetMapping("/")
	public String listar(Model model) {
		model.addAttribute("productos", productoService.listarTodo());
		return "/views/productos/tableth";
	}
	
	@GetMapping("/card")
	public String listarCard(Model model) {
		model.addAttribute("productos", productoService.listarTodo());
		return "/views/productos/cards";
	}

}
