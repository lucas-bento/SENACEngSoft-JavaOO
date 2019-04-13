package aulaOO;

import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
	static final AtomicInteger SEQUENCE =  new AtomicInteger();
	final int codigo;
	final String nome;
	final String cidade;


	Cliente(String nome) {
		codigo = SEQUENCE.incrementAndGet();
		this.nome = nome;
		cidade =  "Pindamonhangaba";
	}
}
