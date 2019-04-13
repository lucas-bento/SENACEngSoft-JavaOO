package aulaOO2;

public class ContaCorrente extends Conta2 {
	
	@Override
	void correcao() {
		this.saldo += this.saldo * 1.2;
	}
}
