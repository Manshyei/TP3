package principal;

import java.util.Date;

public class Ingresso {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String tipoIngresso;
	private int numSala;
	private String tipoSala;
	private int numCadeira;
	private char letraCadeira;
	private String nomeFilme;
	private String idioma;
	private int horarioSessao;
	private Date dataExibicao;
	 
	// ---------------- CONSTRUTOR ---------------- //
	
	public Ingresso(String a, int b, String c, int d, char e, String f, String g, int h, Date i) {
		tipoIngresso = a;
		numSala = b;
		tipoSala = c;
		numCadeira = d;
		letraCadeira = e;
		nomeFilme = f;
		idioma = g;
		horarioSessao = h;
		dataExibicao = i;
	}
		
	// ------------------ METODOS ------------------ //

	public void cadastrar() {
		
	}
		
	// ------------ GETTERS AND SETTERS ------------ //

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

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

	public int getNumCadeira() {
		return numCadeira;
	}

	public void setNumCadeira(int numCadeira) {
		this.numCadeira = numCadeira;
	}

	public char getLetraCadeira() {
		return letraCadeira;
	}

	public void setLetraCadeira(char letraCadeira) {
		this.letraCadeira = letraCadeira;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getHorarioSessao() {
		return horarioSessao;
	}

	public void setHorarioSessao(int horarioSessao) {
		this.horarioSessao = horarioSessao;
	}

	public Date getDataExibicao() {
		return dataExibicao;
	}

	public void setDataExibicao(Date dataExibicao) {
		this.dataExibicao = dataExibicao;
	}
		
}
