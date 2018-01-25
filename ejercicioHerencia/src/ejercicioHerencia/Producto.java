package ejercicioHerencia;

import java.util.Date;

public class Producto {
	private Date fechaCaducidad;
	private Integer noLote;
	
	public Producto(){
		
	}

	public Integer getNoLote() {
		return noLote;
	}

	public void setNoLote(Integer noLote) {
		this.noLote = noLote;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", noLote=" + noLote + "]";
	}
	
	
}
