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
	
	public Ingresso(String tipoIngresso, int numSala, String tipoSala, int numCadeira, char letraCadeira, String nomeDoFilme, String idiomaFilme, int hora, Date dataExibicao) {
		this.tipoIngresso = tipoIngresso;
		this.numSala = numSala;
		this.tipoSala = tipoSala;
		this.numCadeira = numCadeira;
		this.letraCadeira = letraCadeira;
		nomeFilme = nomeDoFilme;
		idioma = idiomaFilme;
		horarioSessao = hora;
		this.dataExibicao = dataExibicao;
	}
		
	// ------------------ METODOS ------------------ //

		
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
