package byteBank;

public class Conta {
	
	//Atributos
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
}
