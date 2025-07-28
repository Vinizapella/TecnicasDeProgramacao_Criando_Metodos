package atv3;

import java.util.Scanner;

public class Casa {

	private String endereco;
	private double area;
	private int nQuartos;
	private double preco;
	
	public Casa() {
		this.endereco = "";
		this.area = 0.0;
		this.nQuartos = 0;
		this.preco = 0.0;
	}
	
	public Casa(String endereco, double area, int nQuartos, double preco) {
		this.endereco = endereco;
		this.area = area;
		this.nQuartos = nQuartos;
		this.preco = preco;
	}
	
	public String getEndereco() {
		return(endereco);
	}
	public double getArea() {
		return(area);
	}
	public int getNQuartos() {
		return(nQuartos);
	}
	public double getPreco() {
	return(preco);
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setNQuartos(int nQuartos) {
		this.nQuartos = nQuartos;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o endereço: ");
		this.endereco = leia.next();
		System.out.println("Digite a área:");
		this.area = leia.nextDouble();
		System.out.println("Digite o numero de quartos: ");
		this.nQuartos = leia.nextInt();
		System.out.println("digite o preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("o endereço é "+ this.endereco);
		System.out.println("A área é "+ this.area);
		System.out.println("O número de quartos é "+ this.nQuartos);
		System.out.println("O preço é de "+ this.preco);
	}
	
}
