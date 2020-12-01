package com.siicore.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siicore.api.entity.Producto;
import com.siicore.api.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoApiController {

	@Autowired
	ProductoService productoService;

	@GetMapping("/")
	public List<Producto> listaProductos() {
		return productoService.listarTodo();
	}
	
	
}
