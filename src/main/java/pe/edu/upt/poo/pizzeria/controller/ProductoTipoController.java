package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;
import pe.edu.upt.poo.pizzeria.service.ProductoTipoService;
import pe.edu.upt.poo.pizzeria.service.ProductoTipoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productoTipo")
public class ProductoTipoController {

    private final ProductoTipoService service;

    public ProductoTipoController(ProductoTipoService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<ProductoTipo>> getById(Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductoTipo>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<ProductoTipo> create(@RequestBody ProductoTipo ProductoTipo){
        return ResponseEntity.ok(service.create(ProductoTipo));
    }

    @PutMapping("/update")
    public ResponseEntity<ProductoTipo> update(@RequestBody ProductoTipo ProductoTipo) {
        ProductoTipo updatedProductoTipo = service.update(ProductoTipo);
        return ResponseEntity.ok(updatedProductoTipo);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
