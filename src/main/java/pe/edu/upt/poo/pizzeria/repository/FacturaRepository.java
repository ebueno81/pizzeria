package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
