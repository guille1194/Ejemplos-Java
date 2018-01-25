package ejercicioComplejos;

public class Complejo {
	private float parteReal;
	private float parteImaginaria;
	
	public Complejo(){
		this.parteReal = 3;
		this.parteImaginaria = 2;
	}
	
	public Complejo(float valorReal, float valorImaginario){
		this.parteReal = valorReal;
		this.parteImaginaria = valorImaginario;
	}
	
	public float getParteReal() {
		return parteReal;
	}
	public void setParteReal(float parteReal) {
		this.parteReal = parteReal;
	}
	public float getParteImaginaria() {
		return parteImaginaria;
	}
	public void setParteImaginaria(float parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	//alt + shift + s
	
	@Override
	public String toString() {
		return "Complejo [parteReal=" + parteReal + ", parteImaginaria=" + parteImaginaria + "]";
	}
	
	public void imprimir() {
		System.out.println("(" + this.parteReal + ", " + this.parteImaginaria + " * i)");
	}
}
