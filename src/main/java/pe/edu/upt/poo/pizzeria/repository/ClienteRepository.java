package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
