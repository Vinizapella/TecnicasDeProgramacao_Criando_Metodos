package atv9de11;

import java.util.Scanner;

public class Bolsa {

		private String nomeEmpresa;
		private double precoAcao;
		private double volumeNegociacoes;
		private double variacaoDiaria;
		
		public Bolsa() {
			this.nomeEmpresa = "";
			this.precoAcao = 0.0;
			this.volumeNegociacoes = 0.0;
			this.variacaoDiaria = 0.0;
		}public Bolsa(String nomeEmpresa, double precoAcao, double volumeNegociacoes, double variacaoDiaria){
			this.nomeEmpresa = nomeEmpresa;
			this.precoAcao = precoAcao;
			this.volumeNegociacoes = volumeNegociacoes;
			this.variacaoDiaria = variacaoDiaria;
		}public String getNomeEmpresa() {
			return(nomeEmpresa);
		}public double getPrecoAcao() {
			return(precoAcao);
		}public double getVolumeNegociacoes() {
			return(volumeNegociacoes);
		}public double getVariacaoDiaria() {
			return(variacaoDiaria);
		}public void setNomeEmpresa(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
		}public void setPrecoAcao( double precoAcao) {
			this.precoAcao = precoAcao;
		}public void setVolumeNegociacoes(double volumeNegociacoes) {
			this.volumeNegociacoes = volumeNegociacoes;
		}public void setVariacaoDiaria(double variacaoDiaria) {
			this.variacaoDiaria = variacaoDiaria;
		}
		
		public void cadastro() {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite o nome da empresa: ");
			this.nomeEmpresa = leia.next();
			System.out.println("Digite o preço da ação:");
			this.precoAcao = leia.nextDouble();
			System.out.println("Digite o volume das negociações: ");
			this.volumeNegociacoes = leia.nextDouble();
			System.out.println("Digite a variação diária: ");
			this.variacaoDiaria = leia.nextDouble();
		}
		
		public void imprimir() {
			System.out.println("O nome da empresa é "+ this.nomeEmpresa);
			System.out.println("O preço da ação é "+ this.precoAcao);
			System.out.println("A volume das negociações é "+ this.volumeNegociacoes);
			System.out.println("A variação diária é "+ this.variacaoDiaria);
		
	}
	
}
