package pe.edu.upt.poo.pizzeria.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.Empresa;
import pe.edu.upt.poo.pizzeria.repository.EmpresaRepository;
import pe.edu.upt.poo.pizzeria.service.EmpresaService;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository repo;

    public EmpresaServiceImpl(EmpresaRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Empresa> findById(Long id) {
        return repo.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Empresa> getAll() {
        return repo.findAll();
    }

    @Transactional
    @Override
    public Empresa create(Empresa entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public Empresa update(Empresa entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
