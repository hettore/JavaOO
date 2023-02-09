
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente hettore = new Cliente();
		hettore.nome = "Hettore Eduardo";
		hettore.cpf = "222.222.222-22";
		hettore.profissao = "programador";
		
		Conta contaDoHettore =  new Conta();
		contaDoHettore.deposita(100);
		
		contaDoHettore.titular = hettore;
		System.out.println(contaDoHettore.titular.nome);

	}

}
