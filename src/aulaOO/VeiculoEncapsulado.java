package aulaOO;

//Encapsulamento
public class VeiculoEncapsulado {
	public static void main(String[] args) {
		VeiculoX v1;
		v1 = new VeiculoX();
		v1.nome = "Gol";
		System.out.println(v1.nome);
		v1.mostravelocidade();
		for (int i = 1; i <= 5; i++) {
			v1.acelera();
			v1.mostravelocidade();
//			System.out.println(v1.velocidade);
		}
	}
}

//public class Veiculo{
class VeiculoX {
	String nome;
	double velocidade;
	
	public void acelera() {
		if (velocidade <= 10) {
			velocidade++;
		}
	}
	
	public void frea() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	void mostravelocidade() {
		System.out.println(velocidade);
	}
}