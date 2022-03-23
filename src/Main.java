
public class Main {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");
		ContaCorrente cc1 = new ContaCorrente(rodrigo);
		Conta cp1 = new ContaPoupanca(rodrigo);
		
		cc1.depositar(100);
		
		cc1.transferir(50, cp1);
		
		cp1.sacar(17.85);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
	}

}
