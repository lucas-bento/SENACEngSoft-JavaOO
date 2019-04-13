package aulaOO2;

public class TestaContaCliente {
	public static void main(String[] args) {
		ContaTransf2 conta1 = new ContaTransf2("Joao","123435346567567");
//		Cliente cliente =  new Cliente();
//		conta.cliente = cliente;
//		conta.cliente.nome = "João";
		
		System.out.println(conta1.cliente.nome);
		
		System.out.println(ContaTransf2.getContadorDeContas());
		
		ContaTransf2 conta2 = new ContaTransf2("Maria", "23895632598734");
		
		System.out.println(ContaTransf2.getContadorDeContas());
	}
}
