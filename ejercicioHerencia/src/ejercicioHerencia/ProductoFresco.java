package ejercicioHerencia;

import java.util.Date;

public class ProductoFresco extends Producto {
	private Date fechaEncasado;
	private String paisOrigen;
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public Date getFechaEncasado() {
		return fechaEncasado;
	}
	public void setFechaEncasado(Date fechaEncasado) {
		this.fechaEncasado = fechaEncasado;
	}
	@Override
	public String toString() {
		return "ProductoFresco [fechaEncasado=" + fechaEncasado + ", paisOrigen=" + paisOrigen + "]";
	}
	public ProductoFresco() {
		// TODO Auto-generated constructor stub
		super();
	}
}
