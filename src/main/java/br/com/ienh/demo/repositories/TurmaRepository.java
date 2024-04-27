package br.com.ienh.demo.repositories;

import br.com.ienh.demo.entities.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends CrudRepository <Turma, Integer> {
}
