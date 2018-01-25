package tectijuana.cloudComputing.estructuras;

public class SeleccionFutbol {
	private int id;
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public SeleccionFutbol(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
	
	public void Concentrarse(){
		System.out.println(Nombre + " Se esta concentrando.");
	}
	
	public void Viajar(){
		System.out.println(Nombre + " Va a viajar.");
	}
}