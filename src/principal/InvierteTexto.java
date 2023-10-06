package principal;

import java.io.*;

/**
 * Ejercicio 1
 * Lee un texto de un fichero, lo invierte y lo imprime en un fichero
 */
public class InvierteTexto {

	public static void main(String[] args) {
		File ficLectura = new File("ficheroLectura.txt");
		
		File ficSalida = new File("ficheroSalida.txt");
		try {
			FileReader lectura = new FileReader(ficLectura);
			FileWriter escritura = new FileWriter(ficSalida);
			String cadena = "";
			
			int i;
			while((i = lectura.read()) != -1) {
				cadena += ((char) i);
			}
			
			char[] arrayCadena = cadena.toCharArray();
			
			for(int j = arrayCadena.length - 1; j >= 0; j--) {
				escritura.write(arrayCadena[j]);
			}
			
			lectura.close();
			escritura.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		

	}

}
