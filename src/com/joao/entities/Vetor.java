package com.joao.entities;

import java.util.Arrays;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

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
		if(!(posicao>=0 && posicao<tamanho)) {
			throw new IllegalArgumentException("posição inválida!");
		}
		return elementos[posicao]; // elementos (nome do convidado na posiçao tal)
	}
	
	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho;i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void adiciona(int posicao, String elemento) {
		if(posicao<0 && posicao>tamanho) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i = tamanho - 1;i>=posicao;i--) {
			this.elementos[i+1] = elementos[i];
		}
		this.elementos[posicao] = elemento;
	    this.tamanho++;
	}
	
	
	
	public void remove(int posicao) {
		if(!(posicao>=0 && posicao<=tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao;i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho --;
	}
		
	@Override
	public String toString() {
		return "Convidados " + Arrays.toString(elementos);
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
