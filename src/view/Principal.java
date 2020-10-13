package view;

import controller.Lista;
import controller.Livro;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro("Livro 1", 2019, 29.99);
		Livro l2 = new Livro("Livro 2", 2017, 15.99);
		Livro l3 = new Livro("Livro 3", 2015, 27.99);
		Livro l4 = new Livro("Livro 4", 2014, 17.99);

		Lista lista = new Lista();
		lista.vazia();
		lista.adiciona(l1);
		lista.adiciona(l2);
		lista.adiciona(l3);
		lista.adiciona(l4);

		

		System.out.println("===================");
		System.out.println("Topo: \n" + lista.top());

		System.out.println("===================");
		System.out.println("Todos Elementos:");
		lista.mostraLivros();
		System.out.println("===================");
		lista.Size();

		System.out.println("===================");
		System.out.println("Removendo primeiro livro:");

		lista.remove();

		lista.mostraLivros();

		System.out.println("===================");
		System.out.println("Topo: \n" + lista.top());

		lista.vazia();
	}
}
