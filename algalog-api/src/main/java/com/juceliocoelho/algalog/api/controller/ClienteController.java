package com.juceliocoelho.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juceliocoelho.algalog.domain.model.Cliente;


@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Jucelio");
		cliente1.setTelefone("33 89345-6655");
		cliente1.setEmail("josedasilva22@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("33 66345-6655");
		cliente2.setEmail("mariadasilva22@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
		}
}
