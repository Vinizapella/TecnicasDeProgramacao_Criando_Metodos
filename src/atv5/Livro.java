package atv5;

import java.util.Scanner;

public class Livro {

	private String titulo;
	private String autor;
	private int nPagina;
	private double preco;
	
	
	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.nPagina = 0;
		this.preco = 0.0;
	}public Livro(String titulo, String autor, int nPagina, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.nPagina = nPagina;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return(titulo);
	}public String getAutor() {
		return(autor);
	}public int getNPagina() {
		return(nPagina);
	}public double getPreco() {
		return(preco);
	}public void setTitulo(String titulo) {
		this.titulo = titulo;
	}public void setAutor(String autor) {
		this.autor = autor;
	}public void setNPagina(int nPagina) {
		this.nPagina = nPagina;
	}public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o titulo: ");
		this.titulo = leia.next();
		System.out.println("Digite o autor:");
		this.autor = leia.next();
		System.out.println("Digite o numero de páginas: ");
		this.nPagina = leia.nextInt();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("O titulo é "+ this.titulo);
		System.out.println("O autor é "+ this.autor);
		System.out.println("O numero de páginas é "+ this.nPagina);
		System.out.println("O preço é de "+ this.preco);
	}
	
}
