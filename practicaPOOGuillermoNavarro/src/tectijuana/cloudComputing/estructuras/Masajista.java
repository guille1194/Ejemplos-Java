package tectijuana.cloudComputing.estructuras;

public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista(){
		super();
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	public void darMasaje() {
		System.out.println(getNombre() + " esta dando masaje.");
	}
}
