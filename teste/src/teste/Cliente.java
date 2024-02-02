package teste;

public class Cliente {
	int idade;
	String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public static void main(String args[]) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas de O. Lima");
		lucas.setIdade(24);
		
		System.out.println(lucas.getNome()+" tem " + lucas.getIdade());
	}
}
