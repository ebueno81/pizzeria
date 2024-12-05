package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Tamanho;

import java.util.List;

public interface TamanhoService {

    public Tamanho getById(Long id);
    public List<Tamanho> getAll();
}
