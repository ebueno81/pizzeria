package pe.edu.upt.poo.pizzeria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upt.poo.pizzeria.modelo.Empresa;
import pe.edu.upt.poo.pizzeria.service.EmpresaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping("/getById")
    public ResponseEntity<Optional<Empresa>> getById(Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Empresa>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Empresa> create(@RequestBody Empresa Empresa){
        return ResponseEntity.ok(service.create(Empresa));
    }

    @PutMapping("/update")
    public ResponseEntity<Empresa> update(@RequestBody Empresa Empresa) {
        Empresa updatedEmpresa = service.update(Empresa);
        return ResponseEntity.ok(updatedEmpresa);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
