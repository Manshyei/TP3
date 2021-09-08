package principal;

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
	
	public SalaCinema(int a, String b, int c, String d, int e, int f, boolean g) {
		numSala = a;
		tipoSala = b;
		qntddCadeiras = c;
		formato = d;
		qnddLinhasCadeiras = e;
		qnddColunasCadeiras = f;
		cadeiraVaga = g;
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
