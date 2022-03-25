
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public ContaPoupanca(Cliente cliente, int agencia) {
		super(cliente, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimir Extrato de Conta Poupança ===");
		super.imprimirExtrato();
	}

}
