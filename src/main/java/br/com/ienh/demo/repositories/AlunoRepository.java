package br.com.ienh.demo.repositories;

import br.com.ienh.demo.entities.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
    List<Aluno> findByCpf(String cpf);
}
