package decorador;

import modelo.ComboDecorador;

public class ConPapas implements ComboDecorador{
	private ComboDecorador combo;
	private final double extra= 200;
	public ConPapas(ComboDecorador combo) {
		super();
		this.combo = combo;
	}

	@Override
	public double calcularPedido(double extraPrecio) {
		double total=extraPrecio;
		total+=combo.calcularPedido(extra);
		mostrarPedido();
		return total;
	}

	@Override
	public void mostrarPedido() {
		System.out.println("Con papas extras.");
	}	

}
