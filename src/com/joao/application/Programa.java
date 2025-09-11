package com.joao.application;

import java.util.Scanner;

import com.joao.entities.Vetor;
 

public class Programa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("Quantos convidados serão cadastrados? ");
		int c = scn.nextInt();
		Vetor vetor = new Vetor(c);
		int op = 0;
		
		do {
			
		
		System.out.println("==== FESTA SUMMER ELETROHITS ====");
		System.out.println("Lista de Convidados");
		System.out.println("1-Cadastrar convidados");
		System.out.println("2-Listar todos os convidados");
		System.out.println("3-Buscar convidado por posição");
		System.out.println("4-Buscar convidado pelo nome");
		System.out.println("5-Inserir convidado");
		System.out.println("6-Remover convidado de uma posição");
		System.out.println("7-Ver quantidade atual de convidados");
		System.out.println("8-Sair");
		System.out.print("DIGITE UMA OPÇÃO: ");
		//System.out.println("=====================================");
		//System.out.println("");
	    op  = scn.nextInt();
		scn.nextLine();
		switch(op) {
		case 1: {
			System.out.println("=== Cadastros de convidados ===");
			System.out.print("Digite o nome: ");
			String nome = scn.nextLine();
			vetor.adiciona(nome);
			System.out.println("Nome cadastrado com sucesso!");
			break;
	    	}
		case 2:{
			System.out.println("Lista de convidados");
			System.out.println(vetor.toString());
			break;
		}
		case 3:{ 
			System.out.println("Busca de convidados");
			System.out.print("Digite o convidado pela posição: ");
			int posicao = scn.nextInt();
			System.out.println("o convidado na posição " + posicao +" é " + vetor.busca(posicao)); 
			//System.out.println(vetor);
			break;
		}
		case 4:{	
			System.out.println("Busca de convidado por nome");
			System.out.print("Digete o nome do convidado: ");
			String nome = scn.nextLine();
			System.out.println("o convidado(a) " + nome + " encontra-se na posição "+vetor.busca(nome));
		
			break;
		}
		case 5:{
			System.out.println("Inserir convidado em uma posição especifica");
			System.out.print("Digite a posicao do convidado: ");
			int pos = scn.nextInt();
		    scn.nextLine(); 
			System.out.println("Digite o nome do convidado: ");
			String nome = scn.nextLine();
			vetor.adiciona(pos, nome);
			System.out.println("convidado " + nome + "adicionado na posição " + pos);
			System.out.println(vetor);
			break;
		}
		case 6: {
			System.out.println("Remoção de convidado de uma posição");
			System.out.print("o convidado de qual posição você deseja remover da lista ? ");
			int pos = scn.nextInt();
			scn.nextLine();
			vetor.remove(pos);
			System.out.println("convidado da posição " + pos + " removido com sucesso!");
			break;
		}
		case 7:{
			System.out.println("Quantidade de atual de convidados " + vetor.getTamanho());
			//System.out.println();
			break;
		}
		case 8:{
			System.out.println("Programa encerrando........");
			break;
		}
	}
		
	}while(op != 8);
		System.out.println("Programa encerrado, boas festas!");
	}
}
