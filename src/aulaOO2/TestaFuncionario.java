package aulaOO2;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Clayton";
		funcionario.salario = 1000;
		funcionario.status = "Professor";
		
		
		System.out.println(funcionario.salario);
		
		funcionario.calculoBonificacao(50);
		
		System.out.println(funcionario.salario);
	}
}
