package one.digitalinnovation.designpatternsspring.Repository;

import one.digitalinnovation.designpatternsspring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
