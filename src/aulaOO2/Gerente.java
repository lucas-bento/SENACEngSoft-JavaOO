package aulaOO2;

public class Gerente extends Funcionario{

	@Override
	public double getBonus() {
		return super.getBonus() + 10000;
	}
	
}
