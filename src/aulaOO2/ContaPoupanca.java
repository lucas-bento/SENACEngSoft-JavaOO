package aulaOO2;

public class ContaPoupanca extends Conta2{
	
	@Override
	void correcao() {
		this.saldo += this.saldo * 1.3;
	}
}
