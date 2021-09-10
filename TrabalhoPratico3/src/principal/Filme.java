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
		
	// Pré-cadastro de dados do cliente:
	
	public void dadosPreCadastradosFilmes(){
		Programacao prog1 = new Programacao(14,"15/03/2021");
		Filme shang_chi = new Filme("Shang-Chi e a lenda dos dez anéis",135,12,"Português","Shang-Chi deve enfrentar o passado quando é atraído para a teia da organização Dez Anéis.", "Ação","02/03/2021",2, prog1);
		Programacao prog2 = new Programacao(15,"23/08/2020");
		Filme viuva_negra = new Filme("Viúva negra",133,12,"Português","Em Viúva Negra, acompanhamos a vida de Natasha Romanoff (Scarlett Johansson) após os eventos de Guerra Civil. Se escondendo do governo norte-americano devido a sua aliança com o time do Capitão América, Natasha ainda precisa confrontar partes de sua história quando surge uma conspiração perigosa ligada ao seu passado. Perseguida por uma força que não irá parar até derrotá-la, ela terá que lidar com sua antiga vida de espiã, e também reencontrar membros de sua família que deixou para trás antes de se tornar parte dos Vingadores.","Ação","02/09/2021",10,prog2);
		Programacao prog3 = new Programacao(12,"19/10/2021");
		Filme pulp_fiction = new Filme("Pulp Fiction - Tempo de violência", 152,18,"Português","Os assassinos Vincent e Jules passam por imprevistos ao recuperar uma mala para um mafioso. O boxeador Butch é pago pelo mesmo mafioso para perder uma luta, e a esposa do criminoso fica sob responsabilidade de Vincent por uma noite. Essas histórias se relacionam numa teia repleta de violência.","Ação","18/02/1995",13,prog3);
		Programacao prog4 = new Programacao(22,"04/12/2021");
		Filme titanic = new Filme("TITANIC", 194, 12, "Português","Jack Dawson (Leonardo DiCaprio) é um jovem aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatlântico Titanic. Trata-se de um luxuoso e imponente navio, anunciado na época como inafundável, que parte para os Estados Unidos. Nele está também Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). Rose está descontente com sua vida, já que sente-se sufocada pelos costumes da elite e não ama Caledon. Entretanto, ela precisa se casar com ele para manter o bom nome da família, que está falida. Um dia, desesperada, Rose ameaça se atirar do Titanic, mas Jack consegue demovê-la da ideia. Pelo ato ele é convidado a jantar na primeira classe, onde começa a se tornar mais próximo de Rose. Logo eles se apaixonam, despertando a fúria de Caledon. A situação fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ninguém imaginava ser possível: o naufrágio do navio.","Drama","16/01/1998",8,prog4);
		Programacao prog5 = new Programacao(16,"16/12/2021");
		Filme gente_grande = new Filme("Gente Grande", 99,12,"Português","Cinco amigos de infância se reencontram após a morte de seu treinador. Juntos novamente, Lenny (Adam Sandler), Eric (Kevin James), Kurt (Chris Rock), Marcus (David Spade) e Rob (Rob Schneider) decidem curtir o feriado de 4 de julho com suas famílias em uma casa no lago. Eles relembram os bons momentos e fazem novas descobertas, além de se meterem em muitas confusões.","Comédia","24/09/2010",5, prog5);
	
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