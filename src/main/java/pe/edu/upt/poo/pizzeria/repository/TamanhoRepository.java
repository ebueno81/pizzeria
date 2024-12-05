package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.Tamanho;

public interface TamanhoRepository extends JpaRepository<Tamanho, Long> {
}
