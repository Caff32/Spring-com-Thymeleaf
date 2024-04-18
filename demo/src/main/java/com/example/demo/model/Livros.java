package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livros {
	
	
    public Livros(Livros data) {
		
		this.nome = data.nome;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;

}
