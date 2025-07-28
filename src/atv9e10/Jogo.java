package atv9e10;

import java.util.Scanner;

public class Jogo {

		private String titulo;
		private String plataforma;
		private String classificacaoEtaria;
		private double preco;
		
		public Jogo() {
			this.titulo = "";
			this.plataforma = "";
			this.classificacaoEtaria = "";
			this.preco = 0.0;
		}public Jogo(String titulo, String plataforma, String classificacaoEtaria, double preco){
			this.titulo = titulo;
			this.plataforma = plataforma;
			this.classificacaoEtaria = classificacaoEtaria;
			this.preco = preco;
		}public String getTitulo() {
			return(titulo);
		}public String getPlataforma() {
			return(plataforma);
		}public String getClassificacaoEtaria() {
			return(classificacaoEtaria);
		}public double getPreco() {
			return(preco);
		}public void setTitulo(String titulo) {
			this.titulo = titulo;
		}public void setPlataforma( String plataforma) {
			this.plataforma = plataforma;
		}public void setClassificacaoEtaria(String classificacaoEtaria) {
			this.classificacaoEtaria = classificacaoEtaria;
		}public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public void cadastro() {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite o titulo: ");
			this.titulo = leia.next();
			System.out.println("Digite a plataforma:");
			this.plataforma = leia.next();
			System.out.println("Digite a classificação de idade: ");
			this.classificacaoEtaria = leia.next();
			System.out.println("Digite o preço: ");
			this.preco = leia.nextDouble();
		}
		
		public void imprimir() {
			System.out.println("O titulo é "+ this.titulo);
			System.out.println("A plataforma é "+ this.plataforma);
			System.out.println("A classificação de idade é "+ this.classificacaoEtaria);
			System.out.println("O preço é "+ this.preco);
		
	}
	
}
