package proyectoExamen.es.curso.parte_2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import proyectoExamen.es.curso.utilsProyectoExamen.ArchivoServicio;

public class MainFicheroExamen {
	private static final Logger logger = LogManager.getLogger(MainFicheroExamen.class);

	public static void main(String[] args) {

		// CREAMOS UN STRING CON LA RUTA DEL FICHERO
		String nombreArchivo = ".//Recursos//FicheroEjercicio2.txt";
		// CREAMOS UN OBJETO DE LA CLASE DE UTILIDADES ARCHIVO SERVICIO PARA PODER USAR
		// SUS MÉTODOS.
		ArchivoServicio servicio = new ArchivoServicio();

		logger.debug("==================  Accediendo al fichero ==========================\n");
		// CREAMOS UN MAPA DONDE GUARDAREMOS LAS LINEAS DEL FICHERO QUE CONTENGAN LA
		// PALABRA JAVA
		Map<Integer, String> mapaLineas = new HashMap<Integer, String>();
		try {
			// HACEMOS UN PRINT DE LA LLAMADA AL MÉTODO LEERARCHIVO PASANDOLE COMO PARÁMETRO
			// EL STRING CON LA RUTA
			// RELATIVA AL ARCHIVO.
			System.out.println(servicio.leerArchivo(nombreArchivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.debug("==================  fin del fichero ==========================\n");
		logger.debug("==================  Comienza el escaneo del fichero ==========================\n");
		// ESCANEAMOS EL ARCHIVO PARA IR GUARDANDO LINEA A LINEA EN EL MAPA
		File archivo = new File(nombreArchivo);
		int contadorFila = 1;
		try (Scanner s = new Scanner(archivo)) {
			// LE INDICAMOS QUE EL CAMBIO DE LINEA ES CUANDO SE ENCUENTRE UN SALTO DE LINEA
			s.useDelimiter("\n");
			// CON UN BUCLE WHILE LE INDICAMOS QUE MIENTRAS NO SEA LA ULTIMA LINEA SIGA
			// EJECUTANDO DICHO BUCLE
			while (s.hasNext()) {
				String stringLinea = s.next();
				// EN CADA VUELTA DEL VUCLE O LO QUE ES LO MISMO CADA LINEA, COMPROBAREMOS SI EN
				// EL CONTENIDO SE ENCUENTRA
				// LA PALABRA "Java" CON EL METODO.CONTAINS DE LOS STRINGS Y EN CASO AFIRMATIVO
				// INSERTAMOS EN EL MAPA LA LINEA
				// COMO VALOR Y SU NÚMERO DE LINEA COMO CLAVE, (CAPTURADO EN LA VARIABLE
				// CONTADORFILA).
				if (stringLinea.contains("Java")) {
					mapaLineas.put(contadorFila, stringLinea);
				}
				contadorFila++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.debug("==================  termina el escaneo del fichero ==========================\n");
		// EL PROCESO COMPLETO ES CAPTURADO POR UN TRY CATCH DEBIDO A LA ALTA
		// PROBABILIDAD DE QUE PUEDAN SURGIR EXCEPCIONES
		// A CAUSA DE LA NO EXISTENCIA DEL ARCHIVO, CAMBIO DE UBICACIÓN IMPOSIBILIDAD DE
		// LEERLO ETC.
		logger.debug("==================  COMIENZAN LAS OPERACIONES SOBRE EL MAPA ==========================\n");
		// COMENZAMOS CON LAS OPERACIONES A REALIZAR SOBRE EL MAPA.
		Set<Integer> claves = mapaLineas.keySet();
		for (Integer clave : claves) {
			String lineaActual = mapaLineas.get(clave);
			int longitudLinea = lineaActual.trim().length();
			System.out.println("La linea número " + clave + " contiene la palabra (Java). Vamos a comprobarlo!!");
			System.out.print(lineaActual);
			System.out.println("La suma de la clave de esta posición del mapa + el total de caracteres de su valor es: "
					+ (longitudLinea + clave));
			System.out.println();
			logger.debug("==================  FIN ==========================\n");
		}

	}

}
