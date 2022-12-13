package com.alex.springboot.testdocker.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.springboot.testdocker.app.models.Usuario;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class TestController {

	@GetMapping
	public Mono<Usuario> findAll() {
		Usuario user = new Usuario("Alex", "Vasquez");
		return Mono.just(user);
	}
	
}
