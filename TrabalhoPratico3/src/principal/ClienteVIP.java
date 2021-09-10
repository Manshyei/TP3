package principal;

import java.util.*;

public class ClienteVIP extends Pessoa {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private String generoFavorito;
	private int qntddFilmesVistos;
	private String planoAssinatura;
	
	public ClienteVIP(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	// Sobrecarga
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email, String genFav, int qntddFilmesVistos, String planAss) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
		generoFavorito = genFav;
		this.qntddFilmesVistos = qntddFilmesVistos;
		planoAssinatura = planAss;
	}
	
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
	}
	
	// ------------------ METODOS ------------------- //
	
	// Funcionalidades:
	
	Scanner input = new Scanner(System.in);	
	ArrayList<ClienteVIP> dadosCliente = new ArrayList<ClienteVIP>();
	
	// Pré-cadastro de dados do cliente:
	
	public void dadosPreCadastradosClientes() {
		ClienteVIP cliente1 = new ClienteVIP("Caio", "Oliveira", "19/10/2001", "014.123.456-43", "(61)-99321-4506", "caioOliveira@hotmail.com", "Ação", 5, "Mensal");
		ClienteVIP cliente2 = new ClienteVIP("Lucas", "Queiroz", "23/08/2001", "324.576.472-04", "(61)-99431-4792", "lucasQueiroz@hotmail.com", "Comédia", 3, "Anual");
		ClienteVIP cliente3 = new ClienteVIP("Joana", "Barboza", "01/01/1999", "577.165.890-81", "(62)-98232-9175", "joanaBarboza@gmail.com", "Aventura", 10, "Semestral");
		ClienteVIP cliente4 = new ClienteVIP("Maicon", "Torres", "10/09/2002", "768.019.355-91", "(61)-98651-0194", "maiconTorres@hotmail.com", "Terror", 2, "Mensal");
		ClienteVIP cliente5 = new ClienteVIP("Maria", "Monaliza", "07/12/1998", "943.987.185-01", "(62)-99184-0192", "mariaMonaliza@hotmail.com", "Policial", 20, "Mensal");
		
		dadosCliente.add(cliente1);
		dadosCliente.add(cliente2);
		dadosCliente.add(cliente3);
		dadosCliente.add(cliente4);
		dadosCliente.add(cliente5);
	}
	
	public void cadastrar() {
		
	}
	
	public void deletar(ClienteVIP[] cliente, String cpf) {
		
	}
	
	public String toString() {	
		return "Nome do cliente VIP: " + primeiroNome;
	}
	
	// ------------ GETTERS AND SETTERS ------------ //
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGeneroFavorito() {
		return generoFavorito;
	}
	
	public void setGeneroFavorito(String generoFavorito) {
		this.generoFavorito = generoFavorito;
	}
	
	public int getQntddFilmesVistos() {
		return qntddFilmesVistos;
	}
	
	public void setQntddFilmesVistos(int qntddFilmesVistos) {
		this.qntddFilmesVistos = qntddFilmesVistos;
	}
	
	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
		
	
}
