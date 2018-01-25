package ejemploMuchosAMuchos;

import java.util.Set;

public class Combustible {
	private Long id;
	private String tipo;
	private Set<Gasolinera> gasolineras;
	
	public Combustible() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Gasolinera> getGasolineras() {
		return gasolineras;
	}

	public void setGasolineras(Set<Gasolinera> gasolineras) {
		this.gasolineras = gasolineras;
	}
}
