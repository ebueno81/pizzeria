package pe.edu.upt.poo.pizzeria.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upt.poo.pizzeria.modelo.Cliente;
import pe.edu.upt.poo.pizzeria.modelo.Factura;
import pe.edu.upt.poo.pizzeria.modelo.FacturaDetalle;
import pe.edu.upt.poo.pizzeria.modelo.ProductoTipo;
import pe.edu.upt.poo.pizzeria.repository.ClienteRepository;
import pe.edu.upt.poo.pizzeria.repository.FacturaRepository;
import pe.edu.upt.poo.pizzeria.service.FacturaService;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl  implements FacturaService {

    private final FacturaRepository facturaRepository;
    private final ClienteRepository clienteRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository, ClienteRepository clienteRepository) {
        this.facturaRepository = facturaRepository;
        this.clienteRepository = clienteRepository;
    }


    @Transactional(readOnly = true)
    @Override
    public Optional<Factura> findById(Long id) {
        return facturaRepository.findById(id);
    }

    @Override
    public List<Factura> getAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura create(Factura entidad) {
        Long clienteId = entidad.getCliente().getId();

        // Recuperar el cliente desde el repositorio
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente con ID " + clienteId + " no encontrado"));

        // Asignar el cliente gestionado a la factura
        entidad.setCliente(cliente);

        // Configurar la relación bidireccional para los detalles de la factura
        if (entidad.getFacturaDetalleList() != null) {
            for (FacturaDetalle detalle : entidad.getFacturaDetalleList()) {
                detalle.setFactura(entidad); // Asignar la factura a cada detalle
            }
        }

        // Guardar la factura
        return facturaRepository.save(entidad);
    }


    @Override
    public Factura update(Factura entidad) {
        return facturaRepository.save(entidad);
    }

    @Override
    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }
}
