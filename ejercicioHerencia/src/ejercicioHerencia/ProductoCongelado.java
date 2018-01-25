package ejercicioHerencia;

public class ProductoCongelado extends Producto {
	private Double temperaturaRecomendada;

	public Double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	
	public ProductoCongelado() {
		// TODO Auto-generated constructor stub
		super();
	}


	public void setTemperaturaRecomendada(Double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return "ProductoCongelado [temperaturaRecomendada=" + temperaturaRecomendada + "]";
	}
}
