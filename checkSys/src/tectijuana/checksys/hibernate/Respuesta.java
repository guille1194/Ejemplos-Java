package tectijuana.checksys.hibernate;

public class Respuesta {
	private Componente componente;
	private IdRespuesta id;
	private String respuesta;
	private Integer orden;
	
	public Respuesta() {
		
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	public IdRespuesta getId() {
		return id;
	}

	public void setId(IdRespuesta id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}	
	
}
