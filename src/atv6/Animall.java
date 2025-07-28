package atv6;

public class Animall {

	public static void main(String[] args) {
		Animal animal1 = new Animal();

		animal1.setEspecie("Cachorro");
		animal1.setRaca("pinscher");
		animal1.setIdade(10);
		animal1.setPeso(5);
		
		System.out.println(animal1.getEspecie());
		System.out.println(animal1.getRaca());
		System.out.println(animal1.getIdade());
		System.out.println(animal1.getPeso());
		
		Animal animal2 = new Animal("Cachorro","Vira-Lata",1,11);
		animal2.imprimir();
		
		Animal animal3 = new Animal();
		animal3.cadastro();
		animal3.imprimir();



	}

}
