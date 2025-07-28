package atv2;

import java.util.Scanner;

public class TV {

	private String marca;
	private int tamanho;
	private String resolucao;
	private double preco;
	
	
	public TV(){
		this.marca = "";
		this.tamanho = 0;
		this.resolucao = "";
		this.preco = 0.0;
	}
	
	public TV(String marca, int tamanho, String resolucao, double preco) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.resolucao = resolucao;
		this.preco = preco;
	}
	
	public String getMarca() {
		return(marca);
	}
	public int getTamanho() {
		return(tamanho);
	}
	public String getResolucao() {
		return(resolucao);
	}
	public double getPreco() {
		return(preco);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a marca da TV: ");
		this.marca = leia.next();
		System.out.println("Digite o tamanho:");
		this.tamanho = leia.nextInt();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
		System.out.println("digite a resolução: ");
		this.resolucao = leia.next();
	}
	
	public void imprimir() {
		System.out.println("A marca da TV é "+ this.marca);
		System.out.println("O tamanho da TV é "+ this.tamanho);
		System.out.println("O preço da TV é "+ this.preco);
		System.out.println("A resolução da TV é de "+ this.resolucao);
	}
	
}
