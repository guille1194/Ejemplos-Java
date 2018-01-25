package tectijuana.checksys.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

public class TipoComponente extends DAO {

	public static List<TipoComponente> obtenerTiposComponentes() {
	List<TipoComponente> lista = null;
	Query consulta = null;
	
		try {
			iniciar();
			
			consulta = obtenerSesion().createQuery("FROM TipoComponente");
			lista = consulta.getResultList();
	
		}
		catch(Exception e){
			System.out.println("TipoComponenteDAO.obtenerTipoComponente");
		}
		return lista;
	}
	public static TipoComponente obtenerTipoComponente(integer ) {
		
	}
	
	public static boolean guardarTipoComponente(TipoComponente tipoComponente) {
		boolean estado = true;
		try {
			iniciar();
			obtenerSesion().save(valorDato);
		}
		catch(Exception e) {
			estado = false;
			regresarEstado();
		}
		
		return estado;
	}
	
	public static boolean borrarTipoComponent(Integer valorId) {
		boolean estado = true;
		TipoComponente dato = null;
		iniciar();
		dato = obtenerTipoComponente(valorId);
		obtenerSesion().delete(dato);
	}
	return estado;
}


