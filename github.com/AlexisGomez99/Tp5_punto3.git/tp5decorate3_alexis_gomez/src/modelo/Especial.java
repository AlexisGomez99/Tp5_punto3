package modelo;

public class Especial implements ComboDecorador{
	private  String descripcion;
	private  double precio;

	
	public Especial(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public double calcularPedido(double extraPrecio) {
		mostrarPedido();
		return precio+extraPrecio;
	}

	@Override
	public void mostrarPedido() {
		System.out.println("Combo especial: "+ descripcion);
	}

}
