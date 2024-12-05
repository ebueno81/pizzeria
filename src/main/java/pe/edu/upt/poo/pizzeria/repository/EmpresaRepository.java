package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
