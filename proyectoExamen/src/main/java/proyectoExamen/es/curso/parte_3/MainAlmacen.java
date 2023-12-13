package proyectoExamen.es.curso.parte_3;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import proyectoExamen.es.curso.parte_3.pojo.Producto;
import proyectoExamen.es.curso.utilsProyectoExamen.UtilsDB;

public class MainAlmacen {
	private static final Logger logger = LogManager.getLogger(MainAlmacen.class);

	public static void main(String[] args) {

/* 
		  
		LA SENTENCIA SQL PARA LA CREACIÓN DE LA TABLA ES:
		
		CREATE TABLE TB_PRODUCTOSEXAMEN (
			    ID INTEGER PRIMARY KEY,
			    Nombre VARCHAR2(255),
			    Tipo VARCHAR2(255) CHECK (Tipo IN ('Alimentación', 'Electrónica', 'Ropa')),
			    Precio DECIMAL(10,2),
			    stock INTEGER
			);
			
*/
		
		
		
		
	}
	
	//CREAR PRODUCTOS
	public int insertarProductos(Producto producto) throws SQLException {
		logger.debug("insertar Producto " + producto);

		String query = "INSERT  "
				+ "INTO TB_PRODUCTOSEXAMEN (ID, Nombre, Tipo, Precio, stock)"
				+ "VALUES (?,?,?,?,?)";
		
		logger.debug("query: " + query);
		PreparedStatement ps = UtilsDB.getInstanceOracle().prepareStatement(query);
		ps.setInt(1,1);
		ps.setString(2, "Carne");
		ps.setString(3, "Alimentacion");
		ps.setInt(4,5);
		ps.setInt(5,10);
		
		int insertados = ps.executeUpdate();
		logger.debug("Productos insertados "+ insertados);
		
		return insertados;
	}

}
