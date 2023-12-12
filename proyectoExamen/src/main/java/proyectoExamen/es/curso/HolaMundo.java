package proyectoExamen.es.curso;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundo {
	private static final Logger LOGGER = LogManager.getLogger(HolaMundo.class);
	public static void main (String [] args ) {
		
		System.out.println("Hola Mundo" + args[0]);
	

	}
}
