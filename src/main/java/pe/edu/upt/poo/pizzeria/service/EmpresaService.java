package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {

    public Optional<Empresa> findById(Long id);
    public List<Empresa> getAll();
    public Empresa create(Empresa entidad);
    public Empresa update(Empresa entidad);
    public void deleteById(Long id);
}
