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
	public ClienteVIP(String primNome, String ultNome, Date data, String c, int numCel, String email, String genFav, int qntddFilmesVistos, String planAss) {
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
	
	public ClienteVIP(String primNome, String ultNome, Date data, String c, int numCel, String email) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
	}
	
	// ------------------ METODOS ------------------- //
	
	//
	
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
	
	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
		
	
}
