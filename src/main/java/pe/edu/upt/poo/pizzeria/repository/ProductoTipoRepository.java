package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;

public interface ProductoTipoRepository extends JpaRepository<ProductoTipo,Long> {
}
