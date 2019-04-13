package aulaOO;

public class Veiculo {
	String nome;
	Double velocidade;
	
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
}
