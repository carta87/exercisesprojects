package pildoras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class ArrayDiagonaliterador {

	public static void main(String[] args) {

		List<List<Integer>> listageneral = new ArrayList<>();
		int posicion = 0;
		int diagonalUno = 0;
		int diagonalDos = 0;
		int sumando = 0;

		System.out.println("programa que le permitira realizar suma en diferentes formas");

		int totalElementos = Integer.parseInt(JOptionPane.showInputDialog("defina total elementos"));
		int[] arrayPrimitive = new int[totalElementos];
		int restando = totalElementos;

		for (int i = 0; i < totalElementos; i++) {

			List<Integer> listaNueva = new ArrayList<>();
			for (int j = 0; j < totalElementos; j++) {
				Integer list = Integer
						.parseInt(JOptionPane.showInputDialog("ingrese a la lista la posicion " + (j + 1) + " = "));
				listaNueva.add(list);
			}
			System.out.println(listaNueva + " linea" + i);
			listageneral.add(listaNueva);

			Iterator<Integer> it = listaNueva.iterator();

			while (it.hasNext()) {
				Integer integer = (Integer)it.next();
				arrayPrimitive[posicion] = integer;
				posicion++;
			}

			posicion = 0;

			diagonalUno += arrayPrimitive[sumando];
			diagonalDos = diagonalDos + arrayPrimitive[restando - 1];
			sumando++;
			restando--;
			
		}
		System.out.println("tenemos los siguientes valores diagoanl1 es " + diagonalUno );
		System.out.println("tenemos los siguientes valores diagoanl2 es " + diagonalDos );
	}

}
