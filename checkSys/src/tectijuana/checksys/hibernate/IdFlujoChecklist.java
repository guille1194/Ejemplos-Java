package tectijuana.checksys.hibernate;

import java.io.Serializable;

public class IdFlujoChecklist implements Serializable {
	
	
	private static final long serialVersionUID = 2009590639273503128L;
	
	private Checklist checklist;
	private Respuesta respuesta;
	
	public IdFlujoChecklist() {
		// TODO Auto-generated constructor stub
	}
	
	public Checklist getChecklist() {
		return checklist;
	}
	public void setChecklist(Checklist checklist) {
		this.checklist = checklist;
	}
	
	public Respuesta getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
}
