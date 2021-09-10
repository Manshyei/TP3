package principal;
import java.util.*;
public class SalaCinema {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private int numSala;
	private String tipoSala;
	private int qntddCadeiras;
	private String formato;
	private int qnddLinhasCadeiras;
	private int qnddColunasCadeiras;
	private boolean cadeiraVaga;
	
	// ---------------- CONSTRUTOR ---------------- //
	
	public SalaCinema(int numero_sala, String tipo_sala, int qtd_cadeiras, String formato_sala, int qtd_linhas, int qtd_colunas, boolean cadeira_vaga) {
		numSala = numero_sala;
		tipoSala = tipo_sala;
		qntddCadeiras = qtd_cadeiras;
		formato = formato_sala;
		qnddLinhasCadeiras = qtd_linhas;
		qnddColunasCadeiras = qtd_colunas;
		cadeiraVaga = cadeira_vaga; 
	}
	
	// ------------- DADOS PRÉ-CADASTRADOS ----------//
	Scanner input = new Scanner(System.in);	
	ArrayList<SalaCinema> dadosSala = new ArrayList<SalaCinema>();
	
	public void dadosPreCadastradosSala(){
		
		SalaCinema sala1 = new SalaCinema(1,"3D",90,"Quadrado",15,6,true);
		SalaCinema sala2 = new SalaCinema(2,"VIP",50,"Quadrado",25,5,false);
		SalaCinema sala3 = new SalaCinema(3,"Normal",80,"Piramide",20,4,true);
		SalaCinema sala4 = new SalaCinema(4,"Normal",100,"Quadrado",25,5,false);
		SalaCinema sala5 = new SalaCinema(5,"Normal",100,"Quadrado",25,5,true);
		
		dadosSala.add(sala1);
		dadosSala.add(sala2);
		dadosSala.add(sala3);
		dadosSala.add(sala4);
		dadosSala.add(sala5);
		
	}


	// ------------ GETTERS AND SETTERS ------------ //
	

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	public int getQntddCadeiras() {
		return qntddCadeiras;
	}

	public void setQntddCadeiras(int qntddCadeiras) {
		this.qntddCadeiras = qntddCadeiras;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getQnddLinhasCadeiras() {
		return qnddLinhasCadeiras;
	}

	public void setQnddLinhasCadeiras(int qnddLinhasCadeiras) {
		this.qnddLinhasCadeiras = qnddLinhasCadeiras;
	}

	public int getQnddColunasCadeiras() {
		return qnddColunasCadeiras;
	}

	public void setQnddColunasCadeiras(int qnddColunasCadeiras) {
		this.qnddColunasCadeiras = qnddColunasCadeiras;
	}

	public boolean isCadeiraVaga() {
		return cadeiraVaga;
	}

	public void setCadeiraVaga(boolean cadeiraVaga) {
		this.cadeiraVaga = cadeiraVaga;
	}

}