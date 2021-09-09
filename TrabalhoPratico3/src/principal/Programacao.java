package principal;

import java.util.Date;

public class Programacao {

	// ----------------- ATRIBUTOS ----------------- //

	private int horario;
	private Date dataExibicao;
	
	
	// ---------------- CONSTRUTOR ---------------- //
	
	public Programacao(int hora, Date dataExibicao) {
		horario = hora;
		this.dataExibicao = dataExibicao;
	}
	
	// ------------ GETTERS AND SETTERS ------------ //
	
	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public Date getDataExibicao() {
		return dataExibicao;
	}

	public void setDataExibicao(Date dataExibicao) {
		this.dataExibicao = dataExibicao;
	}
	
}
