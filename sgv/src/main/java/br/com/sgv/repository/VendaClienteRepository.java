package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.VendaCliente;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface VendaClienteRepository extends CrudRepository<VendaCliente,Long>{
    
}
