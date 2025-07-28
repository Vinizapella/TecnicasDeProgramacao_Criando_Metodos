package atv7;

public class Biciletaa {

	public static void main(String[] args) {
	Bicicleta bicicleta1 = new Bicicleta();

	bicicleta1.setMarca("BMX");
	bicicleta1.setModelo("Que anda");
	bicicleta1.setQuarto(12);
	bicicleta1.setPreco(25);
	
	System.out.println(bicicleta1.getMarca());
	System.out.println(bicicleta1.getModelo());
	System.out.println(bicicleta1.getQuarto());
	System.out.println(bicicleta1.getPreco());
	
	Bicicleta bicicleta2 = new Bicicleta("BMW","Vira",30,870);
	bicicleta2.imprimir();
	
	Bicicleta bicicleta3 = new Bicicleta();
	bicicleta3.cadastro();
	bicicleta3.imprimir();

}
}