
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimir Extrato de Conta Corrente ===");
		super.imprimirExtrato();
	}

}
