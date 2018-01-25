package ejemploMuchosAMuchos;

import java.util.Set;

public class Gasolinera {
	private Long id;
	private String nombre;
	private Set<Combustible> combustibles;
	
	public Gasolinera() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Combustible> getCombustibles() {
		return combustibles;
	}

	public void setCombustibles(Set<Combustible> combustibles) {
		this.combustibles = combustibles;
	}
	
	
}
