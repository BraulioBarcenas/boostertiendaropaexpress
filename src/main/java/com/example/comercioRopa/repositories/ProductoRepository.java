package com.example.comercioRopa.repositories;

import com.example.comercioRopa.data.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    List<Producto> findByPrecioGreaterThan(double precio);
    Producto findByIdAndColor(Long id, String color);
}
