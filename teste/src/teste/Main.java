package teste;

public class Main {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas de O. Lima");
		lucas.setIdade(24);
		
		System.out.println(lucas.getNome()+" tem " + lucas.getIdade());
		
		Funcionario ana = new Funcionario();
		ana.setNome("Ana Silva");
		ana.setIdade(30);
		ana.setMatricula(125);
		ana.setSalario(1500);
		
		System.out.println(ana.getNome()+" tem " + ana.getIdade() + " matricula n# " + ana.getMatricula() + " e recebe " + ana.getSalario());
		System.out.println(ana.CalculaComissao(5));
	}

}
