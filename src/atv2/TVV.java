package atv2;

public class TVV {

	public static void main(String[] args) {

		TV Tv1 = new TV();
		
		Tv1.setMarca("Samsung");
		Tv1.setTamanho(21);
		Tv1.setPreco(750);
		Tv1.setResolucao("4K");
		
		System.out.println(Tv1.getMarca());
		System.out.println(Tv1.getTamanho());
		System.out.println(Tv1.getPreco());
		System.out.println(Tv1.getResolucao());
		
		TV Tv2 = new TV("Apple",5,"2K",3700.0);
		Tv2.imprimir();
		
		TV Tv3 = new TV();
		Tv3.cadastro();
		Tv3.imprimir();
		
		

	}

}
