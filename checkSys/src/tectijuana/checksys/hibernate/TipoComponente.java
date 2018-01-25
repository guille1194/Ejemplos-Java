package tectijuana.checksys.hibernate;

public class TipoComponente {
	
	private Integer id;
	private String descripcion;
	
	public TipoComponente() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoComponente [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
}
