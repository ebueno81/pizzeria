package pe.edu.upt.poo.pizzeria.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.Producto;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;
import pe.edu.upt.poo.pizzeria.modelo.Tamanho;
import pe.edu.upt.poo.pizzeria.repository.ProductoRepository;
import pe.edu.upt.poo.pizzeria.repository.ProductoTipoRepository;
import pe.edu.upt.poo.pizzeria.repository.TamanhoRepository;
import pe.edu.upt.poo.pizzeria.service.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;
    private final ProductoTipoRepository productoTipoRepo;
    private final TamanhoRepository tamanhoRepository;

    public ProductoServiceImpl(ProductoRepository repo, ProductoTipoRepository productoTipoRepo, TamanhoRepository tamanhoRepository) {
        this.repo = repo;
        this.productoTipoRepo = productoTipoRepo;
        this.tamanhoRepository = tamanhoRepository;
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
        Long productoTipoId = entidad.getProductoTipo().getId();
        ProductoTipo productoTipo = productoTipoRepo.findById(productoTipoId)
                .orElseThrow(() -> new RuntimeException("ProductoTipo con ID " + productoTipoId + " no encontrado"));

        Long tamanhoId = entidad.getTamanho().getId();
        Tamanho tamanho = tamanhoRepository.findById(tamanhoId)
                .orElseThrow(() -> new RuntimeException("Tamaño con ID " + tamanhoId + " no encontrado"));

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
