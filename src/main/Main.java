package main;

import trees.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArvoreB bTree = new ArvoreB(3);
		Random random = new Random();
		
		for (int i = 0; i < 30; i++) {
			int numero = random.nextInt(50);
            System.out.println("Numero: " + numero);
            bTree.insere(numero);
        }
		
		/*
		 
		HashEnderecamentoAbertoSondagemLinear meuHash = new HashEnderecamentoAbertoSondagemLinear(16);
		meuHash.insere(11, "onze");
		meuHash.insere(55, "cinquenta e cinco");
			
		meuHash.imprimirTabelaHash();
		
		meuHash.insere(30, "trinta");
		meuHash.insere(40, "quarenta");
		meuHash.insere(21, "vinte e um");
		meuHash.insere(29, "vinte e nove");
		meuHash.insere(51, "cinquenta e um");
		meuHash.insere(13, "treze");
		meuHash.insere(25, "vinte e cinco");
		meuHash.insere(7, "sete");
		meuHash.insere(23, "vinte e tres");
		meuHash.insere(39, "trinta e nove");
		
		meuHash.imprimirTabelaHash();
			
		System.out.print("\nExemplo de sondagem: ");
		for (int i=0;i<16;i++){
			System.out.print(meuHash.hash(0,i) + " ");
		}
		
		HashEnderecamentoAbertoSondagemQuadratica meuHash = new HashEnderecamentoAbertoSondagemQuadratica(16);
		meuHash.insere(11, "onze");
		meuHash.insere(55, "cinquenta e cinco");
			
		meuHash.imprimirTabelaHash();
		
		meuHash.insere(30, "trinta");
		meuHash.insere(40, "quarenta");
		meuHash.insere(21, "vinte e um");
		meuHash.insere(29, "vinte e nove");
		meuHash.insere(51, "cinquenta e um");
		meuHash.insere(13, "treze");
		meuHash.insere(45, "quarenta e cinco");
		meuHash.insere(7, "sete");
		meuHash.insere(23, "vinte e tres");
		meuHash.insere(39, "trinta e nove");
			
		meuHash.imprimirTabelaHash();
		
		System.out.print("\nExemplo de sondagem: ");
		for (int i=0;i<16;i++){
			System.out.print(meuHash.hash(0,i) + " ");
		}
		System.out.println();
	}
	
	HashEnderecamentoAbertoHashDuplo meuHash = new HashEnderecamentoAbertoHashDuplo(16);
		meuHash.insere(11, "onze");
		meuHash.insere(5, "cinco");
			
		meuHash.imprimirTabelaHash();

		meuHash.insere(30, "trinta");
		meuHash.insere(40, "quarenta");
		meuHash.insere(21, "vinte e um");
		meuHash.insere(29, "vinte e nove");
		meuHash.insere(51, "cinquenta e um");
		meuHash.insere(13, "treze");
		meuHash.insere(25, "vinte e cinco");
		meuHash.insere(7, "sete");
		meuHash.insere(23, "vinte e tres");
		meuHash.insere(39, "trinta e nove");

		meuHash.imprimirTabelaHash();
		
		System.out.print("\nExemplo de sondagem: ");
		for (int i=0;i<16;i++){
			System.out.print(meuHash.hash(0,i) + " ");
		}
		System.out.println();
	}
	
	*/
	}
}


