package tectijuana.checksys.hibernate;

import java.io.Serializable;

public class IdBitacora implements Serializable{

	private static final long serialVersionUID = -7317209522177424078L;
	private Checklist checklist;
	private Respuesta respuesta;
	
	public IdBitacora() {
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
