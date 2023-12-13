package proyectoExamen.es.curso.parte_1;

public class Master extends CursoImpl{
	
	//AÑADIMOS EL ATRIBUTO "OFICIAL" YA QUE EL RESTO DE ATRIBUTOS LOS HEREDA
	public Boolean oficial;
	
	
	
	//MÉTODOS CONSTRUCTORES

	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Master(int codigoCurso, String nombreCurso, int cupoMaxCurso, Boolean oficial) {
		super(codigoCurso, nombreCurso, cupoMaxCurso);
		this.oficial = oficial;
	}

	
	
	
	
	
// HEREDAMOS TODOS LOS MÉTODOS DE LA SUPERCLASE O CLASE PADRE CURSOIMPL 
	

	//GETTERS & SETTERS HEREDADOS
	@Override
	public int getCodigoCurso() {
		// TODO Auto-generated method stub
		return super.getCodigoCurso();
	}



	@Override
	public void setCodigoCurso(int codigoCurso) {
		// TODO Auto-generated method stub
		super.setCodigoCurso(codigoCurso);
	}

	@Override
	public String getNombreCurso() {
		// TODO Auto-generated method stub
		return super.getNombreCurso();
	}

	@Override
	public void setNombreCurso(String nombreCurso) {
		// TODO Auto-generated method stub
		super.setNombreCurso(nombreCurso);
	}

	@Override
	public int getCupoMaxCurso() {
		// TODO Auto-generated method stub
		return super.getCupoMaxCurso();
	}

	@Override
	public void setCupoMaxCurso(int cupoMaxCurso) {
		// TODO Auto-generated method stub
		super.setCupoMaxCurso(cupoMaxCurso);
	}

	//GET Y SET NO HEREDADOS.
	public Boolean getOficial() {
		return oficial;
	}

	public void setOficial(Boolean oficial) {
		this.oficial = oficial;
	}
	
	
	
	//MÉTODOS DE FUNCIONALIDAD
	@Override
	public void getCourseName() {
		// TODO Auto-generated method stub
		super.getCourseName();
	}

	@Override
	public void getCourseCode() {
		// TODO Auto-generated method stub
		super.getCourseCode();
	}

	@Override
	public void getCourseCupo() {
		// TODO Auto-generated method stub
		super.getCourseCupo();
	}

	
	
	
	//MÉTODO TO STRING
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
