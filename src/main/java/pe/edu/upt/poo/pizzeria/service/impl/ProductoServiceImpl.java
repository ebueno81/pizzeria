package pe.edu.upt.poo.pizzeria.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.Producto;
import pe.edu.upt.poo.pizzeria.repository.ProductoRepository;
import pe.edu.upt.poo.pizzeria.service.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;

    public ProductoServiceImpl(ProductoRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Producto> findById(Long id) {
        return repo.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Producto> getAll() {
        return repo.findAll();
    }

    @Transactional
    @Override
    public Producto create(Producto entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public Producto update(Producto entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
