package com.unisinos.cloudnativeapplication.resources;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cloud")
public class CloudNativeAppResource implements Serializable {

	private static final long serialVersionUID = 1L;

	@GetMapping(value = "/materia")
	public ResponseEntity<String> getConfigs() {
		return ResponseEntity.ok("2021/1 - Arquitetura de Software - GR16032-00008 - Kleinner Silva Farias de Oliveira");
	}
	
}
