package br.kaue.usjt.agenciaveiculos.Agencia.Veiculos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String Marca;
	private String Modelo;
	private Double Ano;
	private Double Valor;
	private Double tanque;
	private Double eficiencia;
	private Double autonomia;
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public Double getAno() {
		return Ano;
	}
	public void setAno(Double ano) {
		Ano = ano;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	public Double getTanque() {
		return tanque;
	}
	public void setTanque(Double tanque) {
		this.tanque = tanque;
	}
	public Double getEficiencia() {
		return eficiencia;
	}
	public void setEficiencia(Double eficiencia) {
		this.eficiencia = eficiencia;
	}
	public Double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}
	
	
	
//getters/setters
}
