package byteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoHettore = new Conta();
		contaDoHettore.saldo = 100;
		
		contaDoHettore.deposita(50);
		System.out.println(contaDoHettore.saldo);
		
		boolean conseguiRetirar = contaDoHettore.saca(20);
		System.out.println(contaDoHettore.saldo);
		System.out.println(conseguiRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(1001, contaDoHettore)) {
			System.out.println("Transferencia feita com sucesso!");
		}
		else {
			System.out.println("Faltou dinehiro!");
		}
		
		System.out.println(contaDaMarcela.saldo);
		
		System.out.println(contaDoHettore.saldo);
		
	}
}
