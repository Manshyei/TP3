package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Filme {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String nome;
	private int duracao;
	private int classificacaoIndicativa;
	private String idioma;
	private String sinopse;
	private String genero;
	private String dataLancamento;
	private int salaTransmissao;
	private Programacao programacao;
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	public Filme(String nomeDoFilme, int duracaoDoFilme, int classificacao, String idiomaDoFilme, String sinopseFilme, String generoFilme, String data_lancamento, int sala_transmissao, Programacao prog) {
		nome = nomeDoFilme;
		duracao = duracaoDoFilme;
		classificacaoIndicativa = classificacao;
		idioma = idiomaDoFilme;
		sinopse = sinopseFilme;
		genero = generoFilme;
		dataLancamento = data_lancamento;
		salaTransmissao = sala_transmissao;
		programacao = prog;
	}
	
	// Funcionalidades:
	
		ArrayList<Filme> dadosFilmes = new ArrayList<Filme>();
		Scanner scan = new Scanner(System.in);
		
	// Pr�-cadastro de dados do cliente:
	
	public void dadosPreCadastradosFilmes(){
		Programacao prog1 = new Programacao(14,"15/03/2021");
		Filme shang_chi = new Filme("Shang-Chi e a lenda dos dez an�is",135,12,"Portugu�s","Shang-Chi deve enfrentar o passado quando � atra�do para a teia da organiza��o Dez An�is.", "A��o","02/03/2021",2, prog1);
		Programacao prog2 = new Programacao(15,"23/08/2020");
		Filme viuva_negra = new Filme("Vi�va negra",133,12,"Portugu�s","Em Vi�va Negra, acompanhamos a vida de Natasha Romanoff (Scarlett Johansson) ap�s os eventos de Guerra Civil. Se escondendo do governo norte-americano devido a sua alian�a com o time do Capit�o Am�rica, Natasha ainda precisa confrontar partes de sua hist�ria quando surge uma conspira��o perigosa ligada ao seu passado. Perseguida por uma for�a que n�o ir� parar at� derrot�-la, ela ter� que lidar com sua antiga vida de espi�, e tamb�m reencontrar membros de sua fam�lia que deixou para tr�s antes de se tornar parte dos Vingadores.","A��o","02/09/2021",10,prog2);
		Programacao prog3 = new Programacao(12,"19/10/2021");
		Filme pulp_fiction = new Filme("Pulp Fiction - Tempo de viol�ncia", 152,18,"Portugu�s","Os assassinos Vincent e Jules passam por imprevistos ao recuperar uma mala para um mafioso. O boxeador Butch � pago pelo mesmo mafioso para perder uma luta, e a esposa do criminoso fica sob responsabilidade de Vincent por uma noite. Essas hist�rias se relacionam numa teia repleta de viol�ncia.","A��o","18/02/1995",13,prog3);
		Programacao prog4 = new Programacao(22,"04/12/2021");
		Filme titanic = new Filme("TITANIC", 194, 12, "Portugu�s","Jack Dawson (Leonardo DiCaprio) � um jovem aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatl�ntico Titanic. Trata-se de um luxuoso e imponente navio, anunciado na �poca como inafund�vel, que parte para os Estados Unidos. Nele est� tamb�m Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). Rose est� descontente com sua vida, j� que sente-se sufocada pelos costumes da elite e n�o ama Caledon. Entretanto, ela precisa se casar com ele para manter o bom nome da fam�lia, que est� falida. Um dia, desesperada, Rose amea�a se atirar do Titanic, mas Jack consegue demov�-la da ideia. Pelo ato ele � convidado a jantar na primeira classe, onde come�a a se tornar mais pr�ximo de Rose. Logo eles se apaixonam, despertando a f�ria de Caledon. A situa��o fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ningu�m imaginava ser poss�vel: o naufr�gio do navio.","Drama","16/01/1998",8,prog4);
		Programacao prog5 = new Programacao(16,"16/12/2021");
		Filme gente_grande = new Filme("Gente Grande", 99,12,"Portugu�s","Cinco amigos de inf�ncia se reencontram ap�s a morte de seu treinador. Juntos novamente, Lenny (Adam Sandler), Eric (Kevin James), Kurt (Chris Rock), Marcus (David Spade) e Rob (Rob Schneider) decidem curtir o feriado de 4 de julho com suas fam�lias em uma casa no lago. Eles relembram os bons momentos e fazem novas descobertas, al�m de se meterem em muitas confus�es.","Com�dia","24/09/2010",5, prog5);
	
		dadosFilmes.add(shang_chi);
		dadosFilmes.add(viuva_negra);
		dadosFilmes.add(pulp_fiction);
		dadosFilmes.add(titanic);
		dadosFilmes.add(gente_grande);
	
	}
		
	// ------------------ METODOS ------------------ //

	
		
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
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
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