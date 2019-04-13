package aulaOO2;

public class TestaHeranca {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salFunc = f1.getSalario();
		
		System.out.println("salario do funcionario: " + salFunc);
		System.out.println("bonus do funcionario: " + f1.getBonus());
		
		Funcionario d1 = new DBA();
		d1.setSalario(1000);
		double salFunc2 = d1.getSalario();
		
		System.out.println("salario do funcionario: " + salFunc2);
		System.out.println("bonus do funcionario: " + d1.getBonus());
	}
}
