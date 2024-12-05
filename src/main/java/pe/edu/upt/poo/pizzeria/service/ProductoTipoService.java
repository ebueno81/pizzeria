package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;

import java.util.List;
import java.util.Optional;

public interface ProductoTipoService {

    public Optional<ProductoTipo> findById(Long id);
    public List<ProductoTipo> getAll();
    public ProductoTipo create(ProductoTipo entidad);
    public ProductoTipo update(ProductoTipo entidad);
    public void deleteById(Long id);
}
