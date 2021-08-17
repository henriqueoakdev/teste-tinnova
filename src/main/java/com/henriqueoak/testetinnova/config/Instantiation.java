package com.henriqueoak.testetinnova.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.henriqueoak.testetinnova.domain.Veiculo;
import com.henriqueoak.testetinnova.repository.VeiculoRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		veiculoRepository.deleteAll();
		
		Veiculo v1 = new Veiculo(null, "Uno Mille", "Fiat", 2015, "Uno azul seminovo em ótimo estado", false);
		Veiculo v2 = new Veiculo(null, "Mobi", "Fiat", 2017, "Mobi branco 0km", true);
		Veiculo v3 = new Veiculo(null, "Gol", "Volkswagen", 2012, "Gol preto usado", false);
		
		veiculoRepository.saveAll(Arrays.asList(v1, v2, v3));
	}

}
