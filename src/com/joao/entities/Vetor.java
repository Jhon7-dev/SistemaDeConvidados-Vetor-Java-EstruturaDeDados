package com.joao.entities;

public class Vetor {
	private String [] elementos;
	private int tamanho = 0;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho=0;
	}

	public void adiciona(String elemento) {
		for(int i = 0;i<this.elementos.length;i++) {
			if(this.elementos [i] == null) {
				this.elementos[i]=elemento;
				this.tamanho++;
				break;
			}
		}
	}
	public String busca(int posicao) {
		for(int i = 0:i<this.elementos.length;i++) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String[] getElementos() {
		return elementos;
	}



	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
}
