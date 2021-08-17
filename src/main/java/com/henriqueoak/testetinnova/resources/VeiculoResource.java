package com.henriqueoak.testetinnova.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriqueoak.testetinnova.domain.Veiculo;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll(){
		Veiculo v1 =  new Veiculo("Uno", "Fiat", 2015, "Uno Mille azul em ótimo estado", false);
		Veiculo v2 =  new Veiculo("Mobi", "Fiat", 2016, "Mobi branco 0km", true);
		List<Veiculo> list = new ArrayList<>();
		list.addAll(Arrays.asList(v1, v2));
		return ResponseEntity.ok().body(list);
	}
}
