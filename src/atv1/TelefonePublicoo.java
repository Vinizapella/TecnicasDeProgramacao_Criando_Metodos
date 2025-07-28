package atv1;
public class TelefonePublicoo {
	public static void main(String[] args) {
		TelefonePublico telefone1 = new TelefonePublico();
		
		telefone1.setMarca("Sansung");
		telefone1.setModelo("A5");
		telefone1.setPreco(750);
		telefone1.setMemoria("5GB");
		
		System.out.println(telefone1.getMarca());
		System.out.println(telefone1.getModelo());
		System.out.println(telefone1.getPreco());
		System.out.println(telefone1.getMemoria());
		
		TelefonePublico telefone2 = new TelefonePublico("Apple","11",3700,"10GB");
		telefone2.imprimir();
		
		TelefonePublico telefone3 = new TelefonePublico();
		telefone3.cadastro();
		telefone3.imprimir();
		
		
	}
}

