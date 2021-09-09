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
	
	public Combo(String tipoPipoca, String tipoRefri, String tamanhoPipoca, String tamanhoRefri, double custo, String tipoDoce) {
		this.tipoPipoca = tipoPipoca;
		this.tipoRefri = tipoRefri;
		this.tamanhoPipoca = tamanhoPipoca;
		this.tamanhoRefri = tamanhoRefri;
		preco = custo;
		this.tipoDoce = tipoDoce;
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
