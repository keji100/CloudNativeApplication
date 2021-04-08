package com.unisinos.cloudnativeapplication.resources;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudNativeAppResource implements Serializable {

	private static final long serialVersionUID = 1L;

	@GetMapping("/")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("2021/1 - Arquitetura de Software - GR16032-00008 - Kleinner Silva Farias de Oliveira");
	}
	
	@GetMapping("/professor")
	public ResponseEntity<String> getProfessor() {
		return ResponseEntity.ok("Kleinner Silva Farias de Oliveira");
	}
	
	@GetMapping("/alunos")
	public ResponseEntity<String> alunos() {
		return ResponseEntity.ok("Kleinner Silva Farias de Oliveira");
	}
	
}
