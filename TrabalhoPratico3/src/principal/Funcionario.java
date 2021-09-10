package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
	public Funcionario(String primNome, String ultNome, String data, String c, String numCel, String email, String func, String end, double sal) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
		funcao = func;
		endereco = end;
		salario = sal;
	}
	
	public Funcionario(String primNome, String ultNome, String data, String c, String numCel, String email) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
	}
	
	// ------------------ METODOS ------------------ //
	
	// Funcionalidades:
	
	Scanner input = new Scanner(System.in);	
	ArrayList<Funcionario> dadosFuncionario = new ArrayList<Funcionario>();
	
	// Pré-cadastro de dados do cliente:
	
	public void dadosPreCadastradosFuncionario() {
		Funcionario funcionario1 = new Funcionario("Junior", "Filho", "17/11/1991", "543.767.236-63", "(61)-99145-4832", "juniorFilho@hotmail.com", "Atendente", "Residencial Vivace", 3000.0);
		Funcionario funcionario2 = new Funcionario("Nicole", "Soares", "18/12/1988", "934.931.192-04", "(61)-99716-8092", "nicoleSoares@hotmail.com", "Atendente", "Samambaia", 3500.0);
		Funcionario funcionario3 = new Funcionario("Sofia", "Oliveira", "09/05/1981", "943.019.861-09", "(62)-98874-9901", "sofiaOliveira@gmail.com", "Atendente", "Taguatinga", 3500.0);
		Funcionario funcionario4 = new Funcionario("Paulo", "Molares", "11/08/1992", "923.958.105-75", "(61)-98884-9104", "pauloMolares@hotmail.com", "Atendente", "Sudoeste", 3000.0);
		Funcionario funcionario5 = new Funcionario("Rodolfo", "Mimosa", "08/06/1972", "765.087.432-01", "(61)-98780-9809", "rodolfoMimosa@hotmail.com", "Gerente", "Ceilândia", 4000.5);
		
		dadosFuncionario.add(funcionario1);
		dadosFuncionario.add(funcionario2);
		dadosFuncionario.add(funcionario3);
		dadosFuncionario.add(funcionario4);
		dadosFuncionario.add(funcionario5);
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
