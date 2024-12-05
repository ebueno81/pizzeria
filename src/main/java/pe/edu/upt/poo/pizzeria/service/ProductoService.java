package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Producto;

import java.util.List;

public interface ProductoService {

    public Producto findById(Long id);
    public List<Producto> getAll();
}
