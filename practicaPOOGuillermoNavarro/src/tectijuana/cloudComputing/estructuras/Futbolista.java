package tectijuana.cloudComputing.estructuras;

public class Futbolista extends SeleccionFutbol {
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(){
		super();
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
	
	public void jugarPartido() {
		System.out.println("Jugando un partido " + getNombre() + " " + getApellidos() + " con " + getEdad() + " anios de edad.");
	}
	
	public void entrenar() {
		System.out.println(getNombre() + " " + getApellidos() + " esta entrenando");
	}
	
}
