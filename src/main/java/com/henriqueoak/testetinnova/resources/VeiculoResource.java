package com.henriqueoak.testetinnova.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping(value="/{id}")
	public ResponseEntity<VeiculoDTO> findById(@PathVariable String id){
		Veiculo obj = service.findById(id);
		return ResponseEntity.ok().body(new VeiculoDTO(obj));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody VeiculoDTO objDto){
		Veiculo obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
