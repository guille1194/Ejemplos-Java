package tectijuana.checksys.hibernate;

public class FlujoChecklist {
	
	private IdFlujoChecklist id;
	private Componente siguienteComponente;
	private Integer orden;
	
	public FlujoChecklist() {
		// TODO Auto-generated constructor stub
	}

	public IdFlujoChecklist getId() {
		return id;
	}

	public void setId(IdFlujoChecklist id) {
		this.id = id;
	}

	public Componente getSiguienteComponente() {
		return siguienteComponente;
	}

	public void setSiguienteComponente(Componente siguienteComponente) {
		this.siguienteComponente = siguienteComponente;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	
}