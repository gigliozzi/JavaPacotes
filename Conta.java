package modelo;
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// CONSTRUTOR PADRAO MODIFICADO
	public Conta(int agencia, int numero) {
		if(agencia < 1 || numero < 1) {
			throw new IllegalArgumentException("Agencia ou numero invalidos");
		}
		
		
		Conta.total++;
		// System.out.println("Total de contas: " + total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Criando uma conta");
	}

	public static int getTotal() {
		return Conta.total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " ,Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " ,Valor: " + valor);
		}
			this.saldo -= valor;
		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
