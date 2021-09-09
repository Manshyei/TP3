package principal;

public class VendaCombo extends Venda {

	// ----------------- ATRIBUTOS ----------------- //

	private int qntddCombos;
	private Combo combo;
	
	public VendaCombo(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- //
	
	// Sobrecarga
	public VendaCombo(String f, double preco, int rec, int qntd, Combo com) {
		formaPagamento = f;
		precoTotal = preco;
		recibo = rec;
		qntddCombos = qntd;
		combo = com; 
	}
	
	public VendaCombo(String f, double preco, int rec) {
		formaPagamento = f;
		precoTotal = preco;
		recibo = rec;
	}
	
	// ------------------ METODOS ------------------ //
	
	public void cadastrar() {
		
	}
	
	public void buscar() {
		
	}
	
	public String toString() {
		return "Preço total: R$" + precoTotal;
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

	public int getQntddCombos() {
		return qntddCombos;
	}

	public void setQntddCombos(int qntddCombos) {
		this.qntddCombos = qntddCombos;
	}

	public Combo getCombo() {
		return combo;
	}

	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	
}
