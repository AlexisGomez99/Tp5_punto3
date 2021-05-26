package modelo;

public class Basico implements ComboDecorador{
	private  String descripcion;
	private  double precio;
	

	public Basico(String descripcion, double precio) {
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
		System.out.println("Combo basico: "+ descripcion);
	}

}
