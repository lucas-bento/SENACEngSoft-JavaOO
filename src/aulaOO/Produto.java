package aulaOO;

public class Produto {
	int codigo;
	String nome;
	int quantidade;
	double preco;
	
	public void mostraPreco() {
		System.out.println(preco);
	}
	
	public void atualizaPreco(double porc) {
		this.preco = preco + preco * porc / 100 ;
	}
}