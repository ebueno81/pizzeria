package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.FacturaDetalle;

public interface FacturaDetalleRepository  extends JpaRepository<FacturaDetalle,Long> {
}
