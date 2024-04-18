package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.livrosRepository;

@Controller
public class livrosPagController {

	
	@Autowired
	private livrosRepository repository;
	
	
	@GetMapping("/")
	private String ola() {
		
		return "inicio";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("livros", repository.findAll());
		return "/listar"; 
	}
	
	
	
	@GetMapping("/livros/buscar/nome")
	public String getPorNome(@RequestParam("nome") String nome, ModelMap model) {
		
		System.out.println(nome);
		if(nome.equalsIgnoreCase("")) {
			
			model.addAttribute("livros", repository.findAll());
		}else
		{
		
		model.addAttribute("livros", repository.findByNome(nome));
		
		}
		return "/listar";
	}
	
	
	
}
