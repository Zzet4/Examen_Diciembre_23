package proyectoExamen.es.curso.parte_4;


import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import proyectoExamen.es.curso.utilsProyectoExamen.UtilsFechas.UtilsFecha;
import proyectoExamen.es.curso.utilsProyectoExamen.UtilsJPA.UtilsHibernate;

public class MainContratos {
	private static final Logger logger = LogManager.getLogger(MainContratos.class);
	public static void main(String[] args) {
		
		//CONSEGUIMOS EL ENTITY MANAGER PASANDOLE EL PERSISTENCE UNIT DE ORACLE
		EntityManager em = UtilsHibernate.getEM("EjemploOracle");
		//LE DAMOS LA TRANSACCIÓN AL EM.
		EntityTransaction transaction = em.getTransaction();
		Date fechaHoy = UtilsFecha.generaFecha();
		
		
		
		
		
//CREAR E NSERTAR CONTRATOS
		logger.debug("Empezando inserción de contratos");
		Contrato contrato1 = new Contrato("cliente1", UtilsFecha.generaFechaActual(), new Date("31/12/2023") , 1000);
		Contrato contrato2 = new Contrato("cliente2", UtilsFecha.generaFechaActual(), new Date("31/12/2024") , 2000);
		Contrato contrato3 = new Contrato("cliente3", UtilsFecha.generaFechaActual(), new Date("31/12/2025") , 3000);
		
		
		// TODAS LAS OPERACIONES QUE NO SEAN CONSULTA NECESITAN DE LLAMAR AL METODO .GETTRANSACTION().BEGIN();
				// Y DEL MÉTODO GETTRANSACTION().COMMIT(); EN CASO DE HABER REALIZADO LA OPERACIÓN CON ÉXITO O EL 
				// .GETTRANSACTION().ROLLBACK(); EN CASO DE HABER DETECTADO ALGÚN FALLO.
				// ESTA DECISIÓN LA TOMAREMOS BASÁNDONOS EN UN TRY CATCH
				// DENTRO DEL TRY CATCH LLEVAREMOS A CABO LA INSERCIÓN DE NUEVOS REGISTROS MEDIANTE EL MÉTODO .PERSIST
				// PASÁNDOLE COMO PARÁMETRO EL OBJETO CREADO QUE QUEREMOS INSERTAR.
		logger.debug("================== iniciando inserción ==========================\n");
		try {
			em.getTransaction().begin();
			em.persist(contrato1);
			em.persist(contrato2);
			em.persist(contrato3);
			em.getTransaction().commit();
			logger.debug("================== inserción finalizada con éxito ==========================\n");
		} catch (Exception e) {
			logger.debug("================== inserción fallida ==========================\n");
			em.getTransaction().rollback();
		}
		
		
		
		
		
		
//CONSULTAR TODOS LOS CONTRATOS
		// CON EL OBJETO EM QUE TIENE LA CONEXIÓN VAMOS A HACER UN SELECT * DE LA TABLA TB_CONTRATOS
				// RECORDEMOS QUE A HIBERNATE TENEMOS QUE DARLE LA CLASE DEL ENTITY NO LA TABLA.
				logger.debug("================== iniciando la consulta ==========================\n");
				
				// CREAMOS UNA LISTA DE TIPO USUARIO PARA GUARDAR EL LISTADO DE OBJETOS QUE NOS DEVUELVE LA QUERY
				// CON EL OBJETO EM (QUE TIENE LA CONEXIÓN), LLAMAMOS AL MÉTODO .CREATEQUERY Y LE PASAMOS COMO PARÁMETROS:
				
				// "FROM CONTRATO --> PARA INDICARLE EL ENTITY QUE GENERÓ LA TABLA QUE DEBE CONSULTAR
				// CONTRATO.class --> PARA INDICARLE DE QUE TIPO VAN A SER LOS OBJETOS QUE VA A DEVOLVER CON LA QUERY
				
				// FINALMENTE ENCADENAMOS EL METODO .GETRESULTLIST PARA QUE LOS GUARDE EN UNA LISTA COMO YA DEFINIMOS ANTES.
				List<Contrato> contratos = em.createQuery("from Contrato", Contrato.class).getResultList();
				// ESTE METODO CON ESTOS PARÁMETROS EQUIVALE A UN SELECT * DE LA TB_CONTRATO.
				logger.debug("================== consulta finalizada ==========================\n");
				
				// CON UN BUCLE FOR RECORREMOS LA LISTA PARA CONSULTAR LOS OBJETOS CONTRATO RESCATADOS CON LA QUERY
				logger.debug("================== imprimiendo resultado de la consulta ==========================\n");
				for (Contrato contrato : contratos) {
					System.out.println(contrato);
				}

	}
	
	
	
	
	
	
	
	
	

}
