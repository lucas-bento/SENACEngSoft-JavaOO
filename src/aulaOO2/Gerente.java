package aulaOO2;

public class Gerente extends Funcionario implements ControleInterno2 {
	int senha;
	
	@Override
	public double getBonus() {
		return super.getBonus() + 10000;
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
