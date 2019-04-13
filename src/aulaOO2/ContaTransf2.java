package aulaOO2;

public class ContaTransf2 {
	private static int contadorDeContas;
	
	int numero;
//	String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
	public ContaTransf2(String nome, String cpf) {
		System.out.println("testando construtor");
		this.cliente = new Cliente();
		
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		
		ContaTransf2.contadorDeContas++;
	}

	public static int getContadorDeContas() {
		return contadorDeContas;
	}
}
