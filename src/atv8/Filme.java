package atv8;

import java.util.Scanner;

public class Filme {
	
	private String titulo;
	private String diretor;
	private int duracao;
	private double preco;
	
	public Filme() {
		this.titulo = "";
		this.diretor = "";
		this.duracao = 0;
		this.preco = 0.0;
	}public Filme(String titulo, String diretor, int duracao, double preco){
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracao = duracao;
		this.preco = preco;
	}public String getTitulo() {
		return(titulo);
	}public String getDiretor() {
		return(diretor);
	}public int getDuracao() {
		return(duracao);
	}public double getPreco() {
		return(preco);
	}public void setTitulo(String titulo) {
		this.titulo = titulo;
	}public void setDiretor( String diretor) {
		this.diretor = diretor;
	}public void setDuracao(int duracao) {
		this.duracao = duracao;
	}public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o titulo: ");
		this.titulo = leia.next();
		System.out.println("Digite o diretor:");
		this.diretor = leia.next();
		System.out.println("Digite a duração: ");
		this.duracao = leia.nextInt();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("O titulo é "+ this.titulo);
		System.out.println("O diretor é "+ this.diretor);
		System.out.println("A duração é "+ this.duracao);
		System.out.println("O preço é "+ this.preco);
	
}
	
}
