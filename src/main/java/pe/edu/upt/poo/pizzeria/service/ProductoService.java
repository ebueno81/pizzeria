package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public Optional<Producto> findById(Long id);
    public List<Producto> getAll();
    public Producto create(Producto entidad);
    public Producto update(Producto entidad);
    public void deleteById(Long id);
}
