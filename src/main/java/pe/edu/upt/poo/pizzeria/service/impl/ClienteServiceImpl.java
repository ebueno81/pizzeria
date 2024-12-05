package pe.edu.upt.poo.pizzeria.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import pe.edu.upt.poo.pizzeria.modelo.Cliente;
import pe.edu.upt.poo.pizzeria.repository.ClienteRepository;
import pe.edu.upt.poo.pizzeria.service.ClienteService;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repo;

    public ClienteServiceImpl(ClienteRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Cliente> findById(Long id) {
        return repo.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> getAll() {
        return repo.findAll();
    }

    @Transactional
    @Override
    public Cliente create(Cliente cliente) {
        return repo.save(cliente);
    }

    @Transactional
    @Override
    public Cliente update(Cliente cliente) {
        return repo.save(cliente);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
