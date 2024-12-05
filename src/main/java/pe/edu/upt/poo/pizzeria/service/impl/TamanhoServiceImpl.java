package pe.edu.upt.poo.pizzeria.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.Tamanho;
import pe.edu.upt.poo.pizzeria.repository.TamanhoRepository;
import pe.edu.upt.poo.pizzeria.service.TamanhoService;

import java.util.List;
import java.util.Optional;

@Service
public class TamanhoServiceImpl implements TamanhoService {

    private final TamanhoRepository repo;

    public TamanhoServiceImpl(TamanhoRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Tamanho> getById(Long id) {
        return repo.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Tamanho> getAll() {
        return repo.findAll();
    }

    @Transactional
    @Override
    public Tamanho create(Tamanho entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public Tamanho update(Tamanho entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
