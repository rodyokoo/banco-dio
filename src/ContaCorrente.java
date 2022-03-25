
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Cliente cliente, int agencia) {
		super(cliente, agencia);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimir Extrato de Conta Corrente ===");
		super.imprimirExtrato();
	}

}
