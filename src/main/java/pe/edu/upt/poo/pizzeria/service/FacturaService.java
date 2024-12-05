package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Factura;

import java.util.List;

public interface FacturaService {

    public Factura findById(Long id);
    public List<Factura> getAll();
}
