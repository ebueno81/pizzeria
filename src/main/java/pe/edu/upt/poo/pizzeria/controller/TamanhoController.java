package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.Tamanho;
import pe.edu.upt.poo.pizzeria.service.TamanhoService;
import pe.edu.upt.poo.pizzeria.service.TamanhoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tamaño")
public class TamanhoController {

    private final TamanhoService service;

    public TamanhoController(TamanhoService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<Tamanho>> getById(Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Tamanho>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Tamanho> create(@RequestBody Tamanho Tamanho){
        return ResponseEntity.ok(service.create(Tamanho));
    }

    @PutMapping("/update")
    public ResponseEntity<Tamanho> update(@RequestBody Tamanho Tamanho) {
        Tamanho updatedTamanho = service.update(Tamanho);
        return ResponseEntity.ok(updatedTamanho);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
