package teste;
import modelo.Conexao;

public class TesteConexao {

	public static void main(String[] args) {

		try(Conexao con = new Conexao()) {
			con.leDados();
			con.close();
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		}
		
	}

}
