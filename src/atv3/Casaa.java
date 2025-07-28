package atv3;

public class Casaa {

	public static void main(String[] args) {
		Casa casa1 = new Casa();

		casa1.setEndereco("Aqui");
		casa1.setArea(21);
		casa1.setNQuartos(3);
		casa1.setPreco(2.000000);
		
		System.out.println(casa1.getEndereco());
		System.out.println(casa1.getArea());
		System.out.println(casa1.getNQuartos());
		System.out.println(casa1.getPreco());
		
		Casa casa2 = new Casa("Lá",500,5,3700.0);
		casa2.imprimir();
		
		Casa casa3 = new Casa();
		casa3.cadastro();
		casa3.imprimir();
		
		
		
	}

}
