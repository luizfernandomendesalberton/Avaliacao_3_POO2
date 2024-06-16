package com.poo.Prova3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.Prova3.model.Aviao;
import com.poo.Prova3.repository.AviaoRepository;

@Service
public class AviaoService {
	
	@Autowired
	AviaoRepository repository;
	
	public Aviao insereAviao(Aviao a) {
		return repository.save(a);
	}
	
	public Aviao AlteraAviao (Aviao c) {
		return repository.save(c);
	}
	
	public Aviao buscaPoCodigo(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public Aviao buscaPorModelo(String modelo) {
		return repository.findByModelo(modelo);
	}
	
	public void excluiAviao (Aviao a) {
		repository.delete(a);
	}
	
	public List<Aviao> listarTodosAvioes(){
		return repository.findAll();
	}
}