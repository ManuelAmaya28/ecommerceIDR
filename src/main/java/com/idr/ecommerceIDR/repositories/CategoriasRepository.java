package com.idr.ecommerceIDR.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idr.ecommerceIDR.models.Categorias;
import java.util.Optional;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
    Optional<Categorias> findByNombre(String nombre);
}