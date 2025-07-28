package atv9;

import java.util.Scanner;

public class Musica {
	private String titulo;
	private String artista;
	private int duracao;
	private double preco;
	
	public Musica() {
		this.titulo = "";
		this.artista = "";
		this.duracao = 0;
		this.preco = 0.0;
	}public Musica(String titulo, String artista, int duracao, double preco){
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
		this.preco = preco;
	}public String getTitulo() {
		return(titulo);
	}public String getArtista() {
		return(artista);
	}public int getDuracao() {
		return(duracao);
	}public double getPreco() {
		return(preco);
	}public void setTitulo(String titulo) {
		this.titulo = titulo;
	}public void setArtista( String artista) {
		this.artista = artista;
	}public void setDuracao(int duracao) {
		this.duracao = duracao;
	}public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o titulo: ");
		this.titulo = leia.next();
		System.out.println("Digite o artista:");
		this.artista = leia.next();
		System.out.println("Digite a duração: ");
		this.duracao = leia.nextInt();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("O titulo é "+ this.titulo);
		System.out.println("O artista é "+ this.artista);
		System.out.println("A duração é "+ this.duracao);
		System.out.println("O preço é "+ this.preco);
	
}
	
	
}
