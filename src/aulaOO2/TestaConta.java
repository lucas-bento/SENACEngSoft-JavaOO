package aulaOO2;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 =  new Conta();
		
		c1.numero = 001;
		c1.nome = "Mussum";
		c1.saldo = 100.0;
		c1.limite = 10.0;
		
		System.out.println("Numero da conta: " + c1.numero);
		System.out.println("Titular: " + c1.nome);
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextDouble()){
			double sacar = scanner.nextDouble();
		
			boolean sacou = c1.sacar(sacar);
			
			if (sacou) {
				System.out.println("Sacou!");
				System.out.println("Saldo atual: " + c1.saldo);
			} else {
				System.out.println("Não sacou!");
			}
		}
	}
}
