package com.henriqueoak.testetinnova.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String veiculo;
	private String marca;
	private int ano;
	private String descricao;
	private boolean vendido;
	private Date created;
	private Date updated;
	
	public Veiculo() {
		
	}

	public Veiculo(String veiculo, String marca, int ano, String descricao, boolean vendido) {
		super();
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, created, descricao, marca, updated, veiculo, vendido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return ano == other.ano && Objects.equals(created, other.created) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(marca, other.marca) && Objects.equals(updated, other.updated)
				&& Objects.equals(veiculo, other.veiculo) && vendido == other.vendido;
	}
}
