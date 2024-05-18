package org.serratec.trabalho.individualApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Campo vazio!")
	@Size(max=30, message = "Título grande demais!")
	@Column(name="titulo")
	private String título;
	@Embedded
	private InformacaoPublicacao informacaoPublicacao;
	public Livro(Long id, String título, InformacaoPublicacao informacaoPublicacao) {
		super();
		this.id = id;
		this.título = título;
		this.informacaoPublicacao = informacaoPublicacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public InformacaoPublicacao getInformacaoPublicacao() {
		return informacaoPublicacao;
	}
	public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}
	

}
