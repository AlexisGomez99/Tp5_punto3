package main;

import decorador.ConCarne;
import decorador.ConPapas;
import decorador.ConQueso;
import decorador.ConTomates;
import modelo.Basico;
import modelo.ComboDecorador;
import modelo.Familiar;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------COMBO 1---------------------------\n");
		ComboDecorador conPapasYTomastesExtra= new ConTomates((new ConPapas(new Familiar("Assado con entrada y 2 gaseosas de 1 lts c/u", 3000))));
		System.out.println(conPapasYTomastesExtra.calcularPedido(0));
		System.out.println("----------------------COMBO 2---------------------------\n");
		ComboDecorador conQuesoYCarneExtra= new ConQueso((new ConCarne(new Basico("Hamburguesa y 1 gaseosa de 750 mlt", 700))));
		System.out.println(conQuesoYCarneExtra.calcularPedido(0));
	
	}

}
