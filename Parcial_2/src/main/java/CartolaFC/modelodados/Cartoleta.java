package CartolaFC.modelodados;

public class Cartoleta {

	private Float cartoleta;
	
	public void informacoesCartoleta() {
		System.out.println("Cartoleta: " + this.getCartoleta());
	}
	
	public Float getCartoleta() {
		return cartoleta;
	}
	public void setCartoleta(Float cartoleta) {
		this.cartoleta = cartoleta;
	}

}