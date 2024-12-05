package pe.edu.upt.poo.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upt.poo.pizzeria.modelo.Producto;

public interface ProductoRepository  extends JpaRepository<Producto,Long> {
}
