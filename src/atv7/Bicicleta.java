package atv7;

import java.util.Scanner;

public class Bicicleta {

	private String marca;
	private String modelo;
	private double quarto;
	private double preco;
	
	public Bicicleta() {
		this.marca = "";
		this.modelo = "";
		this.quarto = 0.0;
		this.preco = 0.0;
	}public Bicicleta(String marca, String modelo, double quarto, double preco){
		this.marca = marca;
		this.modelo = modelo;
		this.quarto = quarto;
		this.preco = preco;
	}public String getMarca() {
		return(marca);
	}public String getModelo() {
		return(modelo);
	}public double getQuarto() {
		return(quarto);
	}public double getPreco() {
		return(preco);
	}public void setMarca(String marca) {
		this.marca = marca;
	}public void setModelo( String modelo) {
		this.modelo = modelo;
	}public void setQuarto(double quarto) {
		this.quarto = quarto;
	}public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a marca: ");
		this.marca = leia.next();
		System.out.println("Digite o modelo:");
		this.modelo = leia.next();
		System.out.println("Digite o tamanho do quarto: ");
		this.quarto = leia.nextInt();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("A marca é "+ this.marca);
		System.out.println("O modelo é "+ this.modelo);
		System.out.println("O tamanho do quarto é "+ this.quarto);
		System.out.println("O preçoo é "+ this.preco);
	
}
}