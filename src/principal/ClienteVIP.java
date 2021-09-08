package principal;

import java.util.Date;

public class ClienteVIP extends Pessoa {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private String generoFavorito;
	private int qntddFilmesVistos;
	private String planoAsssinatura;
	
	public ClienteVIP(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- //
	
	// Sobrecarga
	public ClienteVIP(String p, String u, Date dt, String c, int num, String e, String g, int fv, String plan) {
		primeiroNome = p;
		ultimoNome = u;
		dataNascimento = dt;
		cpf = c;
		this.numCelular = num;
		email = e;
		generoFavorito = g;
		this.qntddFilmesVistos = fv;
		planoAsssinatura = plan;
	}
	
	public ClienteVIP(String p, String u, Date dt, String c, int num, String e) {
		primeiroNome = p;
		ultimoNome = u;
		dataNascimento = dt;
		cpf = c;
		this.numCelular = num;
		email = e;
	}
	
	// ------------------ METODOS ------------------ //
	
	public void cadastrar() {
		
	}
	
	public void alterar() {
		
	}
	
	public void visualizar() {
		
	}
	
	public void deletar() {
		
	}
	
	public void buscarCPF() {
		
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(int numCelular) {
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
	
	public String getPlanoAsssinatura() {
		return planoAsssinatura;
	}
	
	public void setPlanoAsssinatura(String planoAsssinatura) {
		this.planoAsssinatura = planoAsssinatura;
	}

}
