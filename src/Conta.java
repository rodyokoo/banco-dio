
public abstract class Conta implements IConta{

	private static int AGENCIA_FINAL = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_FINAL;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public Conta(Cliente cliente, int agencia) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;	
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Agência: %d", agencia));
		System.out.println(String.format("Conta: %d", numero));
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		if(ValidaCPF.isCPF(cliente.getCpf())) {
			System.out.println(String.format("CPF: %s", ValidaCPF.imprimeCPF(cliente.getCpf())));			
		} else {
			System.out.println(String.format("CPF inválido!"));						
		}
		System.out.println(String.format("Saldo: R$ %.2f\n", saldo));
	}
}
