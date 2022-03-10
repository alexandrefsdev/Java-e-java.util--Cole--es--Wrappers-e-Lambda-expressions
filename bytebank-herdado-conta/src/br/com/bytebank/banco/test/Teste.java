package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		int tamanho = guardador.getQuantidadeDeElementos();
		
		Conta cc =  new ContaCorrente(45, 50);
		System.out.println(tamanho);
		guardador.adiciona(cc);
		
		Conta cc2 =  new ContaCorrente(45, 50);
		guardador.adiciona(cc2);
		tamanho = guardador.getQuantidadeDeElementos();

		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
	}

}
