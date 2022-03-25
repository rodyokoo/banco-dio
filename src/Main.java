
public class Main {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");
		rodrigo.setCpf("01751367185");
		
		Cliente flavia = new Cliente("Flavia", "00000000000");

		ContaCorrente cc1 = new ContaCorrente(rodrigo);
		Conta cp1 = new ContaPoupanca(rodrigo);
		
		ContaCorrente cc2 = new ContaCorrente(flavia, 610);
		
		cc1.depositar(100);
		
		cc1.transferir(50, cp1);
		
		cp1.sacar(17.85);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		cc2.imprimirExtrato();
	}

}
