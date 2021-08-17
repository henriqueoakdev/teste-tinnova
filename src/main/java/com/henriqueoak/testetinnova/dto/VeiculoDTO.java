package com.henriqueoak.testetinnova.dto;

import java.io.Serializable;

import com.henriqueoak.testetinnova.domain.Veiculo;

public class VeiculoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String veiculo;
	private String marca;
	private int ano;
	private String descricao;
	private boolean vendido;
	
	public VeiculoDTO() {
		
	}
	
	public VeiculoDTO(Veiculo obj) {
		id = obj.getId();
		veiculo = obj.getVeiculo();
		marca = obj.getMarca();
		ano = obj.getAno();
		descricao = obj.getDescricao();
		vendido = obj.isVendido();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
}
