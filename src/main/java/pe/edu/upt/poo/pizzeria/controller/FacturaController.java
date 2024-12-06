package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.Factura;
import pe.edu.upt.poo.pizzeria.modelo.Factura;
import pe.edu.upt.poo.pizzeria.service.FacturaService;
import pe.edu.upt.poo.pizzeria.service.FacturaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    private final FacturaService service;

    public FacturaController(FacturaService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<Factura>> getById(Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Factura>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Factura> create(@RequestBody Factura Factura){
        return ResponseEntity.ok(service.create(Factura));
    }

    @PutMapping("/update")
    public ResponseEntity<Factura> update(@RequestBody Factura Factura) {
        Factura updatedFactura = service.update(Factura);
        return ResponseEntity.ok(updatedFactura);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
