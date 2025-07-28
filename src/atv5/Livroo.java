package atv5;

public class Livroo {

	public static void main(String[] args) {
		Livro livro1 = new Livro();

		livro1.setTitulo("Em chamas");
		livro1.setAutor("Suzanne Collins");
		livro1.setNPagina(400);
		livro1.setPreco(30);
		
		System.out.println(livro1.getTitulo());
		System.out.println(livro1.getAutor());
		System.out.println(livro1.getNPagina());
		System.out.println(livro1.getPreco());
		
		Livro livro2 = new Livro("Jogos Vorazes","Suzanne Collins",400,23);
		livro2.imprimir();
		
		Livro livro3 = new Livro();
		livro3.cadastro();
		livro3.imprimir();


	}

}
