package teste;


public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		Conta cc = new ContaCorrente(-663, 78900);
		cc.deposita(100);

		Conta cp = new ContaPoupanca(8794, 8794);
		cp.deposita(200);

		cc.transfere(110, cp);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
