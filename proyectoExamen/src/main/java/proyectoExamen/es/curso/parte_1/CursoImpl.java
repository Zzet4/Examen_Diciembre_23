package proyectoExamen.es.curso.parte_1;

public class CursoImpl implements Curso{
	
	//ATRIBUTOS
	private int codigoCurso;
	private String nombreCurso;
	private int cupoMaxCurso;
	
	
	
	
	
	
	
	
	//MÉTODOS CONSTRUCTORES
	
		//MÉTODO CONSTRUCTOR VACÍO
	public CursoImpl() {

	}
	
	
		//MÉTODO CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public CursoImpl(int codigoCurso, String nombreCurso, int cupoMaxCurso) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.cupoMaxCurso = cupoMaxCurso;
	}
	

		//MÉTODOS GETTERS & SETTERS
	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCupoMaxCurso() {
		return cupoMaxCurso;
	}

	public void setCupoMaxCurso(int cupoMaxCurso) {
		this.cupoMaxCurso = cupoMaxCurso;
	}

	
	
	
	
	
	
	
	
		//MÉTODOS PARA FUNCIONALIDADES SOBREESCRITOS DE LA INTERFAZ
	@Override
	public void getCourseName() {
		
		
	}

	@Override
	public void getCourseCode() {
	
		
	}

	@Override
	public void getCourseCupo() {

		
	}

	

		//MÉTODO TO STRING
	@Override
	public String toString() {
		return "CursoImpl [codigoCurso=" + codigoCurso + ", nombreCurso=" + nombreCurso + ", cupoMaxCurso="
				+ cupoMaxCurso + "]";
	}
	
	
	
	

}
