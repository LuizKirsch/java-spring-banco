package br.com.ienh.demo.repositories;

import br.com.ienh.demo.entities.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, Integer > {
}
