package br.com.padariadogerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.padariadogerson.modelo.Padaria;


@Repository
public interface PadariaRepository extends JpaRepository<Padaria, Integer>{

	
}
