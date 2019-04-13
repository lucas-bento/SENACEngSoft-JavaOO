package aulaOO2;

public class DBA extends Funcionario implements ControleInterno2 {
	int senha;
	
	public double getBonus() {
		return this.salario * 0.25;
	}
	
	public boolean verificaSenha(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	@Override
	public boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
