package proyectoExamen.es.curso.parte_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import proyectoExamen.es.curso.utilsProyectoExamen.UtilsGeneral;

public class MainAcademia {
	private static final Logger logger = LogManager.getLogger(MainAcademia.class);
	public static void main(String[] args) {
		
		logger.debug("================== Cargando Cursos ==========================\n");
		//CREACIÓN DE OBJETOS UTILIZANDO LOS DOS TIPOS DE CONSTRUCTORES DISPONIBLES.
		Master master1 = new Master(1, "curso 1", 10, true);
		Master master2 = new Master(2, "curso 2", 20, false);
		Master master3 = new Master();
			master3.setCodigoCurso(3);
			master3.setNombreCurso("Curso 3");
			master3.setCupoMaxCurso(30);
			master3.setOficial(false);
		logger.debug("==================  Cursos Cargados ==========================\n");
		
		//CREAMOS UN MAPA Y GUARDAMOS LOS CURSOS (MASTERS) QUE HEMOS CREADO ANTERIORMENTE
		logger.debug("==================  Guardando cursos en mapa ==========================\n");
		Map<Integer, CursoImpl> mapaCursos = new HashMap<Integer, CursoImpl>();
			mapaCursos.put(master1.getCodigoCurso(),master1);
			mapaCursos.put(master2.getCodigoCurso(),master2);
			mapaCursos.put(master3.getCodigoCurso(),master3);
		logger.debug("==================  Cursos Guardados ==========================\n");

			
		
		//MÉTODO PARA BORRAR UN CURSO POR CLAVE
			//CREAMOS UN OBJETO DE LA CLASE MAIN
		MainAcademia servicio = new MainAcademia();
		servicio.deleteCourse(mapaCursos);
		
			
		//MÉTODO PARA IMPRIMIR LOS CURSOS
		servicio.ShowOfficialCourses(mapaCursos);
			
	}
	
	
	public static void deleteCourse(Map<Integer, CursoImpl> mapaCursos) {
		logger.debug("================== Iniciamos metodo para borrar ==========================\n");
		int claveCursoBorrar = UtilsGeneral.scanInt("Seleccione el códiogo del curso que desea eliminar");
		mapaCursos.remove(claveCursoBorrar);
		logger.debug("==================  metodo borrar finalizado ==========================\n");
	}

	public static List<CursoImpl> ShowOfficialCourses(Map<Integer, CursoImpl> mapaCursos) {
		logger.debug("================== Iniciamos metodo para mostrar másteres oficiales ==========================\n");
		List<CursoImpl> masteresOficiales = new ArrayList();
		Set<Integer> claves = mapaCursos.keySet();
		for (Integer clave : claves) {
				masteresOficiales.add(mapaCursos.get(clave));
			}
		for (CursoImpl master : masteresOficiales) {
			System.out.println(master);
		}
		logger.debug("================== Iniciamos metodo para mostrar másteres oficiales ==========================\n");
		
		
//		//PRIMERA FORMA DE IMPRIMIR LA LISTA RECORRIENDO UN FOREACH EN UNA LINEA CON INTERFACES FUNCIONALES
//		masteresOficiales.forEach(master -> System.out.println(master));
//		
//		//SEGUNDA FORMA DE IMPRIMIR LA LISTA RECORRIENDO UN FOREACH EN UNA LINEA CON INTERFACES FUNCIONALES
//		masteresOficiales.forEach(System.out::println);

		
		//DEVOLVEMOS LA LISTA POR SI LA NECESITAMOS PARA ALGO
		return masteresOficiales;
	
	}
	
}
