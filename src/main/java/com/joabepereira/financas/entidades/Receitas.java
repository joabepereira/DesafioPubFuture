package com.joabepereira.financas.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Receitas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private double valor;
	private String dataRecebimento;
	private String dataRecebimentoEsperado;
	private String descricao;
	private String tipoReceita;
	
	public Receitas() {
	}

	public Receitas(Long id, double valor, String dataRecebimento, String dataRecebimentoEsperado, String descricao, String tipoReceita) {
		//super();
		this.id = id;
		this.valor = valor;
		this.dataRecebimento = dataRecebimento;
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
		this.descricao = descricao;
		this.tipoReceita = tipoReceita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getDataRecebimentoEsperado() {
		return dataRecebimentoEsperado;
	}

	public void setDataRecebimentoEsperado(String dataRecebimentoEsperado) {
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receitas other = (Receitas) obj;
		return Objects.equals(id, other.id);
	}
	
	
}