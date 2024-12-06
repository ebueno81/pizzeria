package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Factura;

import java.util.List;
import java.util.Optional;

public interface FacturaService {

    public Optional<Factura> findById(Long id);
    public List<Factura> getAll();
    public Factura create(Factura entidad);
    public Factura update(Factura entidad);
    public void deleteById(Long id);
}
