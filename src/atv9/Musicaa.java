package atv9;

public class Musicaa {

	public static void main(String[] args) {
	Musica musica1 = new Musica();

	musica1.setTitulo("Swim");
	musica1.setArtista("Chase Atlantic");
	musica1.setDuracao(3);
	musica1.setPreco(0);
	
	System.out.println(musica1.getTitulo());
	System.out.println(musica1.getArtista());
	System.out.println(musica1.getDuracao());
	System.out.println(musica1.getPreco());
	
	Musica musica2 = new Musica("Colo de mãe","Colo de Deus",9,0);
	musica2.imprimir();
	
	Musica musica3 = new Musica();
	musica3.cadastro();
	musica3.imprimir();
	
}
}