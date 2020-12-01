package com.siicore.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siicore.api.entity.Producto;
import com.siicore.api.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> listarTodo() {

		return productoRepository.findAll();
	}

}
