package controller;

public class Lista {

	private Livro topo, anterior;
	private int tamanho;

	public void adiciona(Livro livro) {
		if (anterior == null) {
			anterior = livro;
		} else {
			topo = livro;
			topo.setAnterior(anterior);
			anterior = topo;
		}
		tamanho++;
	}
	
	public void vazia() { 
		if (anterior == null && topo == null) {
			System.out.println("A lista esta vazia");
		}
			
		
	}
	
	public void remove() {
		topo = topo.getAnterior();
		anterior = topo;
	}

	public Livro top() {
		return topo;
	}

	public void mostraLivros() {
		Livro aux = topo;

		while (aux != null) {
			System.out.println(aux.toString());
			aux = aux.getAnterior();
		}
	}

	public void Size() {
		System.out.println("A lista possui " + tamanho + " livros");
	}
	
}
