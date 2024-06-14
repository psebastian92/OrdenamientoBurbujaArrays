package ordenamiento_burbuja;

import java.util.Arrays;
import java.util.Collection;

public class ordenamiento_burbuja {
	public static void main(String[] args) {
		int[] arreglo = { 5, 2, 8, 3, 1 };

		// Mostrar el arreglo desordenado
		System.out.println("Arreglo desordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}

		// Aplicar el algoritmo de ordenamiento burbuja

		for (int i = 0; i < (arreglo.length - 1); i++) {
			// Este for es para volver a comparar todos los elementos

			for (int j = 0; j < (arreglo.length - i - 1); j++) {
				// Este for SOLO me manda el numero mas grande a la posicion mas alta.

				/*
				 * arreglo.length - i - 1: elimina pasadas innecesarias ya que el valor mas alto
				 * siempre quedara en la ultima posicion desde el inicio del ordenamiento.
				 */

				if (arreglo[j] > arreglo[j + 1]) {

					// Intercambiar los elementos
					int temporal = arreglo[j];
					// SI TENGO MAS DE UN ARRAY: String temporalNombre = nombre[j];

					/*
					 * temporal sirve para guardar por un momento al valor mas alto.
					 */

					arreglo[j] = arreglo[j + 1];
					// SI TENGO MAS DE UN ARRAY: nombre[j] = nombre[j+1]

					// La primera posicion de las dos, toma el valor de la segunda (que es mas
					// chico).
					arreglo[j + 1] = temporal;
					// SI TENGO MAS DE UN ARRAY: nombre[j+1] = temporalNombre ;

					// La segunda posicion, toma el valor mas alto.
				}
			}
		}

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
	}
}