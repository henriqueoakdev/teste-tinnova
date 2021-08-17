package com.henriqueoak.testetinnova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriqueoak.testetinnova.domain.Veiculo;
import com.henriqueoak.testetinnova.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository v;
	
	public List<Veiculo> findAll(){
		return v.findAll();
	}
}
