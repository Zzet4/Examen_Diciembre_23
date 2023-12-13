package proyectoExamen.es.curso.utilsProyectoExamen;

import java.util.Scanner;

public class UtilsGeneral {
	
	
	public static String scanString (String stringQuery) {
		System.out.println( stringQuery);
		Scanner scan = new Scanner(System.in);
		String capturaString = scan.nextLine();
		return capturaString;
	}
	
	
	public static int scanInt (String intQuery) {
		System.out.println(intQuery);
		Scanner scan = new Scanner (System.in);
		int capturaInt = scan.nextInt();
		return capturaInt;
	}
	
	

}
