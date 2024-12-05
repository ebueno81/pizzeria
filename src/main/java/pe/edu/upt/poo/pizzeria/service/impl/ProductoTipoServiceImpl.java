package pe.edu.upt.poo.pizzeria.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;
import pe.edu.upt.poo.pizzeria.repository.ProductoTipoRepository;
import pe.edu.upt.poo.pizzeria.service.ProductoTipoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoTipoServiceImpl implements ProductoTipoService {

    private final ProductoTipoRepository repo;

    public ProductoTipoServiceImpl(ProductoTipoRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<ProductoTipo> findById(Long id) {
        return repo.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<ProductoTipo> getAll() {
        return repo.findAll();
    }

    @Transactional
    @Override
    public ProductoTipo create(ProductoTipo entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public ProductoTipo update(ProductoTipo entidad) {
        return repo.save(entidad);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
