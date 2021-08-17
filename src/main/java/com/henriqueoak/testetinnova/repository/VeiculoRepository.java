package com.henriqueoak.testetinnova.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.henriqueoak.testetinnova.domain.Veiculo;

@Repository
public interface VeiculoRepository extends MongoRepository<Veiculo, String>{
	
}
