
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "marcela";
		
		
		
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.getSaldo());

	}

}
