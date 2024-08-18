package com.devsandoval.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsandoval.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
