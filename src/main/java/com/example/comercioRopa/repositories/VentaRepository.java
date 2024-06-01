package com.example.comercioRopa.repositories;

import com.example.comercioRopa.data.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    Venta findByTotal(double total);
}