package principal;

public abstract class Venda {

	// ----------------- ATRIBUTOS ----------------- //
	
	protected String formaPagamento;
	protected double precoTotal;
	protected int recibo;
	
	// ---------------- CONSTRUTOR ---------------- //
	
	// ------------------ METODOS ------------------ //
	
	public void cadastrar() {
		
	}

	// ------------ GETTERS AND SETTERS ------------ //
	
	public String getFormaPagamento() {
		return formaPagamento; 
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public int getRecibo() {
		return recibo;
	}

	public void setRecibo(int recibo) {
		this.recibo = recibo;
	}
	
}
