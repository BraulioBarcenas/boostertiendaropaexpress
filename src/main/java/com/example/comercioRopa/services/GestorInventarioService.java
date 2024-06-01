package com.example.tiendaropa.services;



@Service
public class GestorInventarioService {
    private final ProductoRepository productoRepository;
    private final ProveedorRepository proveedorRepository;

    public GestorInventarioService(ProductoRepository productoRepository, ProveedorRepository proveedorRepository) {
        this.productoRepository = productoRepository;
        

    public void agregarProducto(Producto producto) {
        
    }

    public void actualizarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

