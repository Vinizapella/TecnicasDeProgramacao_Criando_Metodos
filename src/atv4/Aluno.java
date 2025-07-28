package atv4;

import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private int idade;
	private String matricula;
	private int anoIngresso;
	
	public Aluno() {
		this.nome = "";
		this.idade = 0;
		this.matricula = "";
		this.anoIngresso = 0;
	}
	public Aluno(String nome, int idade, String matricula, int anoIngresso) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
	}
	
	public String getNome() {
		return(nome);
	}public int getIdade() {
		return(idade);
	}public String getMatricula() {
		return(matricula);
	}public int getAnoIngresso() {
		return(anoIngresso);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}public void setIdade(int idade) {
		this.idade = idade;
	}public void setMatricula(String matricula) {
		this.matricula = matricula;
	}public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		this.nome = leia.next();
		System.out.println("Digite a idade:");
		this.idade = leia.nextInt();
		System.out.println("Digite o numero da matricula: ");
		this.matricula = leia.next();
		System.out.println("Digite o ano que ingressou: ");
		this.anoIngresso = leia.nextInt();
	}
	
	public void imprimir() {
		System.out.println("O nome é "+ this.nome);
		System.out.println("A idade é "+ this.idade);
		System.out.println("A matricula é "+ this.matricula);
		System.out.println("O ano que ingressou de "+ this.anoIngresso);
	}
	
}
