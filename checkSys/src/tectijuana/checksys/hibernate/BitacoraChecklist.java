package tectijuana.checksys.hibernate;

import java.util.Date;

public class BitacoraChecklist {
	private IdBitacora id;
	private String usuario;
	private  Date fecha;
	
	public BitacoraChecklist() {
		// TODO Auto-generated constructor stub
	}

	public IdBitacora getId() {
		return id;
	}

	public void setId(IdBitacora id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
