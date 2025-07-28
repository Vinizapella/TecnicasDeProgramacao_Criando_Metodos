package atv4;

public class Alunoo {

	public static void main(String[] args) {
		Aluno casa1 = new Aluno();

		casa1.setNome("Victória");
		casa1.setIdade(15);
		casa1.setMatricula("111.222");
		casa1.setAnoIngresso(2025);
		
		System.out.println(casa1.getNome());
		System.out.println(casa1.getIdade());
		System.out.println(casa1.getMatricula());
		System.out.println(casa1.getAnoIngresso());
		
		Aluno aluno2 = new Aluno("Vinicius",17,"222.111",2023);
		aluno2.imprimir();
		
		Aluno aluno3 = new Aluno();
		aluno3.cadastro();
		aluno3.imprimir();

	}

}
