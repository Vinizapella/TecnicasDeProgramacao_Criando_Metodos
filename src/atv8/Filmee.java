package atv8;

public class Filmee {

	public static void main(String[] args) {
		Filme filme1 = new Filme();

		filme1.setTitulo("BMX");
		filme1.setDiretor("Que anda");
		filme1.setDuracao(12);
		filme1.setPreco(25);
		
		System.out.println(filme1.getTitulo());
		System.out.println(filme1.getDiretor());
		System.out.println(filme1.getDuracao());
		System.out.println(filme1.getPreco());
		
		Filme filme2 = new Filme("BMW","Vira",30,870);
		filme2.imprimir();
		
		Filme filme3 = new Filme();
		filme3.cadastro();
		filme3.imprimir();

	}

}
