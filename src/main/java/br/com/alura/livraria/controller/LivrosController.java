package br.com.alura.livraria.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.livraria.dto.LivrosDto;
import br.com.alura.livraria.dto.LivrosFormDto;
import br.com.alura.livraria.service.LivrosService;

@RestController
@RequestMapping ("/livros")
public class LivrosController {
	
	@Autowired
	private LivrosService service;
	
	@GetMapping
	public List<LivrosDto> listar(){
		return service.listar();
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid LivrosFormDto dto) {
		service.cadastrar(dto);
	}

}
