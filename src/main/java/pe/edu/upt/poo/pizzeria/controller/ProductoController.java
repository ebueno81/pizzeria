package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.Producto;
import pe.edu.upt.poo.pizzeria.service.ProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<Producto>> getById(Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Producto>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto Producto){
        return ResponseEntity.ok(service.create(Producto));
    }

    @PutMapping("/update")
    public ResponseEntity<Producto> update(@RequestBody Producto Producto) {
        Producto updatedProducto = service.update(Producto);
        return ResponseEntity.ok(updatedProducto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
