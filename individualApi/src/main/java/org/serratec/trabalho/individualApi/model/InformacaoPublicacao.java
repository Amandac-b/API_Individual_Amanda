package org.serratec.trabalho.individualApi.model;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable

public class InformacaoPublicacao {
	
	private String autor;
	private String editor;
	private Date dataPublicacao;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
}
