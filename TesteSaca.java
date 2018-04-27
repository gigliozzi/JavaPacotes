package teste;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(2804, 5134);
		
		c.deposita(200);
		
		try {
			c.saca(210);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("SAldo: " + c.getSaldo());
	}

}
