package br.com.ienh.demo.repositories;

import br.com.ienh.demo.entities.Contato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Integer > {
    public List<Contato> findByTipo(String tipo);
    public List<Contato> findByTipoOrderByDescricaoDesc(String tipo);
}
