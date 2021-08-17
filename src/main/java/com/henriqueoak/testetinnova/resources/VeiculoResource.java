package com.henriqueoak.testetinnova.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriqueoak.testetinnova.domain.Veiculo;
import com.henriqueoak.testetinnova.dto.VeiculoDTO;
import com.henriqueoak.testetinnova.services.VeiculoService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;
	
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>> findAll(){
		List<Veiculo> list = service.findAll();
		List<VeiculoDTO> listDto = list.stream().map(x -> new VeiculoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
