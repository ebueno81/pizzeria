package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.FacturaDetalle;

import java.util.List;

public interface FacturaDetalleService {

    public FacturaDetalle findById(Long id);
    public List<FacturaDetalle> getAll();

}
