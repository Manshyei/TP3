package principal;

public class VendaIngresso extends Venda {

	// ----------------- ATRIBUTOS ----------------- //

	private int qntddIngressos;
	private Ingresso ingresso;
	
	public VendaIngresso(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- //
	
	// Sobrecarga
	public VendaIngresso(String formaDePagamento, double preco, int rec, int qntd_ingressos, Ingresso i) {
		formaPagamento = formaDePagamento;
		precoTotal = preco;
		recibo = rec;
		qntddIngressos = qntd_ingressos;
		ingresso = i;
	} 
	
	public VendaIngresso(String formaDePagamento, double preco, int rec) {
		formaPagamento = formaDePagamento;
		precoTotal = preco;
		recibo = rec;
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

	public int getQntddIngressos() {
		return qntddIngressos;
	}

	public void setQntddIngressos(int qntddingressos) {
		this.qntddIngressos = qntddingressos;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
}
