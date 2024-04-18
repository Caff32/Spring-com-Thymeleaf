package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Livros;

@Repository
public interface livrosRepository extends JpaRepository<Livros, Long> {

	

	List findByNome(String nome);
 
}
