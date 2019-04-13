package aulaOO;

public class UsaCliente {
	public static void main(String[] args) {

		int i = 0;
		while (i < 100) {
			Cliente c = new Cliente("Maria_" + i);
			
			System.out.println(c.nome);
			System.out.println(c.codigo);
			System.out.println(c.cidade);
			
			i++;
		}
	}
}
