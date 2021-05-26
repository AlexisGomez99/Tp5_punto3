package modelo;

public class Familiar implements ComboDecorador{
	private  String descripcion;
	private  double precio;
	
	
	public Familiar(String descripcion, double precio) {
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
		System.out.println("Combo familiar: "+ descripcion);
	}

}
