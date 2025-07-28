package atv9de11;

public class Bolsaa {

	public static void main(String[] args) {
		Bolsa bolsa1 = new Bolsa();

		bolsa1.setNomeEmpresa("Microsoft");
		bolsa1.setPrecoAcao(45);
		bolsa1.setVolumeNegociacoes(8);
		bolsa1.setVariacaoDiaria(2.79);
		
		System.out.println(bolsa1.getNomeEmpresa());
		System.out.println(bolsa1.getPrecoAcao());
		System.out.println(bolsa1.getVolumeNegociacoes());
		System.out.println(bolsa1.getVariacaoDiaria());
		
		Bolsa bolsa2 = new Bolsa("Audi",20000,2,4.8);
		bolsa2.imprimir();
		
		Bolsa bolsa3 = new Bolsa();
		bolsa3.cadastro();
		bolsa3.imprimir();

	}

}
