package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livros;
import com.example.demo.repository.livrosRepository;

@RestController
public class livrosController {

	@Autowired
	private livrosRepository repository;
	
	@GetMapping("/listarv")
	public List<Livros> listar ()
	{
		
		return repository.findAll();
	}
	
	@PostMapping("/inserir")
	public Livros inserir(@RequestBody Livros livro) {
		
		System.out.println(livro.getNome());
		
		
		Livros dados =  new Livros(livro);	
		
		System.out.println(dados.getNome());
		
		return repository.save(dados);
	}
}
