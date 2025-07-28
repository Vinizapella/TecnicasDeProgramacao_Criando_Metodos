package atv9e10;

public class Jogoo {

	public static void main(String[] args) {
		Jogo jogo1 = new Jogo();

		jogo1.setTitulo("Mine");
		jogo1.setPlataforma("Todas");
		jogo1.setClassificacaoEtaria("Livre");
		jogo1.setPreco(27.90);
		
		System.out.println(jogo1.getTitulo());
		System.out.println(jogo1.getPlataforma());
		System.out.println(jogo1.getClassificacaoEtaria());
		System.out.println(jogo1.getPreco());
		
		Jogo jogo2 = new Jogo("Terraria","Todas","Livre",17.90);
		jogo2.imprimir();
		
		Jogo jogo3 = new Jogo();
		jogo3.cadastro();
		jogo3.imprimir();
	}

}
