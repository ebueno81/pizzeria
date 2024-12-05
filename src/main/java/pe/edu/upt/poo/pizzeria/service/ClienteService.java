package pe.edu.upt.poo.pizzeria.service;

import pe.edu.upt.poo.pizzeria.modelo.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public Optional<Cliente> findById(Long id);
    public List<Cliente> getAll();
    public Cliente create(Cliente cliente);
    public Cliente update(Cliente cliente);
    public void deleteById(Long id);
}
