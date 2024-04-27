package br.com.ienh.demo.controllers;

import br.com.ienh.demo.entities.Aluno;
import br.com.ienh.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping("/teste")
    public String teste(){
//        Iterable<Aluno> alunos = alunoRepository.findAll();
//        for (Aluno aluno : alunos){
//            System.out.println(aluno);
//        }
//        alunoRepository.findById(6).ifPresent(System.out::println);
        alunoRepository.findByCpf("32123423434");
        return "teste";
    }
}
