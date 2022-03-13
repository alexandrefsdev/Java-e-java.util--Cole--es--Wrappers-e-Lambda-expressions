package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();

		
		Conta cc =  new ContaCorrente(45, 50);

		lista.add(cc);
		
		Conta cc2 =  new ContaCorrente(45, 2002);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		
		Conta cc3 =  new ContaCorrente(45, 2015);
		lista.add(cc3);
		
		Conta cc4 =  new ContaCorrente(45, 3525);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("----------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
		
		
	}

}