package aulaOO2;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		if ((this.saldo + this.limite) > valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
//		double saldoAlterado = saldo - valor;
//		saldo = saldoAlterado;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
}
