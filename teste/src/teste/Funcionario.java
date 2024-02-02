package teste;

public class Funcionario extends Cliente {
	int matricula;
	double salario;
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double CalculaComissao(int vendas) {
		double salarioNovo = this.salario + (100 * vendas);
		return salarioNovo;
	}
}
