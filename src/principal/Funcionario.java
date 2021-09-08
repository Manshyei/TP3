package principal;

import java.util.Date;

public class Funcionario extends Pessoa {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String funcao;
	private String endereco;
	private double salario;
	
	public Funcionario(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- //
	
	// Sobrecarga
	public Funcionario(String p, String u, Date dt, String c, int num, String e, String f, String end, double sal) {
		primeiroNome = p;
		ultimoNome = u;
		dataNascimento = dt;
		cpf = c;
		this.numCelular = num;
		email = e;
		funcao = f;
		endereco = end;
		salario = sal;
	}
	
	public Funcionario(String p, String u, Date dt, String c, int num, String e) {
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
		return "Nome do funcionario: " + primeiroNome + ", valor do salario: R$" + salario;
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
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
