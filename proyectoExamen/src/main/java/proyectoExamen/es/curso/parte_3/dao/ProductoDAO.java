package proyectoExamen.es.curso.parte_3.dao;


import java.util.Date;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import proyectoExamen.es.curso.parte_3.ProductosInfo;
import proyectoExamen.es.curso.parte_3.pojo.Producto;

public class ProductoDAO {
	//CREAMOS EL ENTITYMANAGER DIRECTAMENTE COMO ATRIBUTO PARA PODER USARLO EN TODOS LOS METODOS DE LA CLASE
	private EntityManager em;

	public ProductoDAO(EntityManager em) {
		this.em = em;
	}

	public List<Producto> getProductos() {
		return em.createQuery("from TB_PRODUCTOSEXAMEN", Producto.class).getResultList();
	}

//	public List<Producto> getProductosByDate(Date fechaConsulta) {
//		TypedQuery<Producto> query = em.createQuery("from Producto p where p.fechaAlta=?1", Producto.class);
//		query.setParameter(1, fechaConsulta);
//
//		List<Producto> productos = query.getResultList();
//
//		return productos;
//	}

	// SELECT
//
//	public List<Object[]> getInfoTiposProductos() {
//
//		Query query = em.createQuery("" + 
//				"SELECT " + 
//					"p.tipo, " + 
//					"ROUND(AVG(p.precio),2) , " + 
//					"SUM(p.unidades) "
//				+ "from Producto p " + "GROUP BY p.tipo");
//
//		List<Object[]> respuesta = query.getResultList();
//
//		return respuesta;
//	}
//
//	public List<ProductosInfo> getInfoTiposProductosHQL() {
//
//		TypedQuery<ProductosInfo> query = 
//				em.createQuery("" + "SELECT " + 
//					"new es.curso.java.hibernate.ejercicios.ejercicio2.pojos.ProductosInfo( " + 
//					"ROUND(AVG(p.precio),2) , " + 
//					"SUM(p.unidades), p.tipo ) "
//				+ "from Producto p " + "GROUP BY p.tipo",ProductosInfo.class);
//
//		List<ProductosInfo> respuesta = query.getResultList();
//
//		return respuesta;
//	

	public void insertarProductos(List<Producto> productos) {
		em.getTransaction().begin();
		try {

			for (Producto producto : productos) {
				em.persist(producto);
			}

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

	}
}
