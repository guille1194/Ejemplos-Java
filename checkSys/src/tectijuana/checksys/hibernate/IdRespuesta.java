package tectijuana.checksys.hibernate;

import java.io.Serializable;

public class IdRespuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4376356270978488993L;
	
	
	private Componente componente;
	private Integer idRespuesta;
	
	public Componente getComponente() {
		return componente;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
	public Integer getIdRespuesta() {
		return idRespuesta;
	}
	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}
	
	
}
