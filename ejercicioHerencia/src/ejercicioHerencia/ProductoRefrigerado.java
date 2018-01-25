package ejercicioHerencia;

public class ProductoRefrigerado extends Producto {
	
	private String organismoSupervesion;

	public String getOrganismoSupervesion() {
		return organismoSupervesion;
	}

	public void setOrganismoSupervesion(String organismoSupervesion) {
		this.organismoSupervesion = organismoSupervesion;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [organismoSupervesion=" + organismoSupervesion + "]";
	}
	public ProductoRefrigerado() {
		// TODO Auto-generated constructor stub
		super();
	}

}
