package atv6;

import java.util.Scanner;

public class Animal {

	private String especie;
	private String raca;
	private int idade;
	private double peso;
	
	public Animal() {
		this.especie = "";
		this.raca = "";
		this.idade = 0;
		this.peso = 0.0;
	}public Animal(String especie, String raca, int idade, double peso){
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}public String getEspecie() {
		return(especie);
	}public String getRaca() {
		return(raca);
	}public int getIdade() {
		return(idade);
	}public double getPeso() {
		return(peso);
	}public void setEspecie(String especie) {
		this.especie = especie;
	}public void setRaca( String raca) {
		this.raca = raca;
	}public void setIdade(int idade) {
		this.idade = idade;
	}public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a especie: ");
		this.especie = leia.next();
		System.out.println("Digite a raça:");
		this.raca = leia.next();
		System.out.println("Digite a idade: ");
		this.idade = leia.nextInt();
		System.out.println("Digite o peso: ");
		this.peso = leia.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("A especie é "+ this.especie);
		System.out.println("A raça é "+ this.raca);
		System.out.println("A idade é "+ this.idade);
		System.out.println("O peso é "+ this.peso);
	}
	
}
