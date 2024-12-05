package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;
import pe.edu.upt.poo.pizzeria.modelo.Tamanho;

import java.util.List;
import java.util.Optional;

public interface TamanhoService {

    public Optional<Tamanho> getById(Long id);
    public List<Tamanho> getAll();
    public Tamanho create(Tamanho entidad);
    public Tamanho update(Tamanho entidad);
    public void deleteById(Long id);
}
