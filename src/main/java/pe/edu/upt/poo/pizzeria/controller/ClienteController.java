package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.Cliente;
import pe.edu.upt.poo.pizzeria.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<Cliente>> getById(Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Cliente>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        return ResponseEntity.ok(service.create(cliente));
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
        Cliente updatedCliente = service.update(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
