package principal;

import java.util.Date;

public class Filme {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String nome;
	private int duracao;
	private int classificacaoIndicativa;
	private String idioma;
	private String sinopse;
	private String genero;
	private Date dataLancamento;
	private int salaTransmissao;
	private Programacao programacao;
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	public Filme(String a, int b, int c, String d, String e, String f, Date g, int h, Programacao i) {
		nome = a;
		duracao = b;
		classificacaoIndicativa = c;
		idioma = d;
		sinopse = e;
		genero = f;
		dataLancamento = g;
		salaTransmissao = h;
		programacao = i;
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
	
	public void buscarNome() {
		
	}
		
	// ------------ GETTERS AND SETTERS ------------ //
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getSalaTransmissao() {
		return salaTransmissao;
	}
	
	public void setSalaTransmissao(int salaTransmissao) {
		this.salaTransmissao = salaTransmissao;
	}
	
	public Programacao getProgramacao() {
		return programacao;
	}

	public void setProgramacao(Programacao programacao) {
		this.programacao = programacao;
	}
	
}
