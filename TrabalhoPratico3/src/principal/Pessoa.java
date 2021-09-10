package principal;

import java.util.Date;

public abstract class Pessoa {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	protected String primeiroNome;
	protected String ultimoNome;
	protected Date dataNascimento;
	protected String cpf;
	protected int numCelular;
	protected String email;
	
	public Pessoa() {
		super(); 
	}
		
	// ---------------- CONSTRUTOR ---------------- //
		

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
	
	public void deletar(Pessoa[] pessoas, String cpf) {
		
	}
		
}
