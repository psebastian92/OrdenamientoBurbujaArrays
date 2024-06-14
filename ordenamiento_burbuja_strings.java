package ordenamiento_burbuja;

public class ordenamiento_burbuja_strings {
	public static void main(String[] args) {
		String[] palabras = { "zorro", "perro", "gato", "elefante", "jirafa" };

		// Mostrar la lista desordenada
		System.out.println("Lista desordenada:");
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}

		// Aplicar el algoritmo de ordenamiento burbuja
		
		for (int i = 0; i < palabras.length - 1; i++) {
			for (int j = 0; j < palabras.length - i - 1; j++) {
				if (palabras[j].compareTo(palabras[j + 1]) > 0) {
					// Intercambiar las palabras
					String temp = palabras[j];
					palabras[j] = palabras[j + 1];
					palabras[j + 1] = temp;
				}
			}
		}

		// Mostrar la lista ordenada
		System.out.println("\nLista ordenada:");
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
	}
}
