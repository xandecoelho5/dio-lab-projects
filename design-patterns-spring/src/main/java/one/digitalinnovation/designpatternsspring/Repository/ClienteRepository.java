package one.digitalinnovation.designpatternsspring.Repository;

import one.digitalinnovation.designpatternsspring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
