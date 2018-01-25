package tectijuana.checksys.hibernate;

public class Componente {
	
	private Integer id;
	private String mensaje;
	private TipoComponente tipoComponente;
	
	public Componente() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public TipoComponente getTipoComponente() {
		return tipoComponente;
	}

	public void setTipoComponente(TipoComponente tipoComponente) {
		this.tipoComponente = tipoComponente;
	}

	@Override
	public String toString() {
		return "Componente [id=" + id + ", mensaje=" + mensaje + ", tipoComponente=" + tipoComponente + "]";
	}
}
