package atv1;
import java.util.Scanner;
public class TelefonePublico {
	private String marca;
	private String modelo;
	private double preco;
	private String memoria;
	
	public TelefonePublico(){
		this.marca = "";
		this.modelo = "";
		this.preco = 0.0;
		this.memoria = "";
	}
	
	public TelefonePublico(String marca, String modelo, double preco, String memoria ) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.memoria = memoria;
	}
	
	public String getMarca() {
		return(marca);
	}
	public String getModelo() {
		return(modelo);
	}
	public double getPreco() {
		return(preco);
	}
	public String getMemoria() {
		return(memoria);
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	public void cadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a marca do aparelho: ");
		this.marca = leia.next();
		System.out.println("Digite o modelo do aparelo:");
		this.modelo = leia.next();
		System.out.println("Digite o preço: ");
		this.preco = leia.nextDouble();
		System.out.println("digite a memoria do aparelho: ");
		this.memoria = leia.next();
	}
	
	public void imprimir() {
		System.out.println("A marca do aparelho é "+ this.marca);
		System.out.println("O modelo do aparelho é "+ this.modelo);
		System.out.println("O preço do aparelho é "+ this.preco);
		System.out.println("A memoria do aparelho é de "+ this.memoria);
	}
	
}
