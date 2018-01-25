package tectijuana.cloudComputing.estructuras;

public class Entrenador extends SeleccionFutbol {
	private String idFederacion;
	
	public Entrenador(){
		super();
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}
	
	public void dirigirPartido() {
		System.out.println(getNombre() + "Esta dirigiendo el partido.");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println(getNombre() + "Esta dirigiendo el entrenamiento");
	}
}
