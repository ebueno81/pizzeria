package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Empresa;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;

import java.util.List;

public interface ProductoTipoService {

    public ProductoTipo findById(Long id);
    public List<ProductoTipo> getAll();
    public ProductoTipo create(ProductoTipo entidad);
    public ProductoTipo update(ProductoTipo entidad);
    public void deleteById(Long id);
}
