
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(150, 12345);
		
		
		System.out.println(conta.getAgencia());

		
		Conta conta2 = new Conta(150, 16549);
		
		System.out.println(Conta.getTotal());
		
	}

}
