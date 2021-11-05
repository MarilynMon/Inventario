package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.repositorio.*;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
	@Autowired
	private PersonaRepository PersonaRepositorio;


	
	public Persona create (Persona persona) {
		return PersonaRepositorio.save(persona);
	}
	
	public List<Persona> getAllPersonas (){
		return PersonaRepositorio.findAll();
	}
	
	public void delete (long id) {
		PersonaRepositorio.deleteById(id);
	}
	
	public Persona actualizar (Persona persona){
		 return PersonaRepositorio.save(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return PersonaRepositorio.findById(id);
	}
}
