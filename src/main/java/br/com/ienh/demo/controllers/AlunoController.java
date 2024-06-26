package br.com.ienh.demo.controllers;

import br.com.ienh.demo.entities.Aluno;
import br.com.ienh.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping("/listar")
    public String listar(Model model){

        Iterable<Aluno> alunos = alunoRepository.findAll();
        model.addAttribute("alunos", alunos);
        return "/aluno/listar";
    }
}
