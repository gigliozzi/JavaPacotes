package teste;
import modelo.ContaCorrente;

public class TestaInterface {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(888, 888);
		
		cc.deposita(5000);
		
		System.out.println(cc.getValorImposto());

	}

}
