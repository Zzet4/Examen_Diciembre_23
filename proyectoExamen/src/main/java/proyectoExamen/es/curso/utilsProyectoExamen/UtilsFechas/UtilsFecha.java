package proyectoExamen.es.curso.utilsProyectoExamen.UtilsFechas;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UtilsFecha {
	
	public static Date generaFecha() {
		Date fecha = null;
		Calendar calendario = Calendar.getInstance();

        //calendario.set(2022, Calendar.NOVEMBER, 1, 7, PM, 20, 10, 125);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 1);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        fecha = calendario.getTime();
		
		return fecha;
	}

	public static Date generaFechaActual() {
		Date fecha = new Date();
		return fecha;
	}
	
	public static Date generaFechaMenosDias(int dias) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -15);
		Date nowMinusDays = c.getTime();
		
		return nowMinusDays;
	}
}
