package com.siicore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siicore.api.entity.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long> {

}
