package byteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiRetirar);
		
	}
}
