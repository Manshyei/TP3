package principal;

public class Combo {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String tipoPipoca;
	private String tipoRefri;
	private String tamanhoPipoca;
	private String tamanhoRefri;
	private double preco;
	private String tipoDoce;
		
	// ---------------- CONSTRUTOR ---------------- // 
	
	public Combo(String a, String b, String c, String d, double e, String f) {
		tipoPipoca = a;
		tipoRefri = b;
		tamanhoPipoca = c;
		tamanhoRefri = d;
		preco = e;
		tipoDoce = f;
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

	public String getTipoPipoca() {
		return tipoPipoca;
	}

	public void setTipoPipoca(String tipoPipoca) {
		this.tipoPipoca = tipoPipoca;
	}

	public String getTipoRefri() {
		return tipoRefri;
	}

	public void setTipoRefri(String tipoRefri) {
		this.tipoRefri = tipoRefri;
	}

	public String getTamanhoPipoca() {
		return tamanhoPipoca;
	}

	public void setTamanhoPipoca(String tamanhoPipoca) {
		this.tamanhoPipoca = tamanhoPipoca;
	}

	public String getTamanhoRefri() {
		return tamanhoRefri;
	}

	public void setTamanhoRefri(String tamanhoRefri) {
		this.tamanhoRefri = tamanhoRefri;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipoDoce() {
		return tipoDoce;
	}

	public void setTipoDoce(String tipoDoce) {
		this.tipoDoce = tipoDoce;
	}
	
}
