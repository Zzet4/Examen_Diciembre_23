package proyectoExamen.es.curso.parte_4;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CONTRATO")
public class Contrato {
	
	// ATRIBUTOS
		@Id
		@SequenceGenerator(name = "CONTRATOGEN", sequenceName = "CONTRATO_GEN", initialValue = 1, allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTRATOGEN")
		@Column(name = "ID", nullable = false, updatable = false)
		private int id;
	
		@Column(name = "NOMBRE")
		private String nombreCliente;
		@Column(name = "FECHA_INICIO")
		private Date fechaInicio;
		@Column(name = "FECHA_FIN")
		private Date fechaFin;
		@Column(name = "IMPORTE")
		private int importe;
		
		
		
		public Contrato() {
			super();

		}
		
		
		public Contrato( String nombreCliente, Date fechaInicio, Date fechaFin, int importe) {
			super();
			this.nombreCliente = nombreCliente;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.importe = importe;
		}
		
		
		public Contrato(int id, String nombreCliente, Date fechaInicio, Date fechaFin, int importe) {
			super();
			this.id = id;
			this.nombreCliente = nombreCliente;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.importe = importe;
		}






		public int getId() {
			return id;
		}






		public void setId(int id) {
			this.id = id;
		}






		public String getNombreCliente() {
			return nombreCliente;
		}






		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}






		public Date getFechaInicio() {
			return fechaInicio;
		}






		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}






		public Date getFechaFin() {
			return fechaFin;
		}






		public void setFechaFin(Date fechaFin) {
			this.fechaFin = fechaFin;
		}






		public int getImporte() {
			return importe;
		}






		public void setImporte(int importe) {
			this.importe = importe;
		}






		@Override
		public String toString() {
			return "Contrato [id=" + id + ", nombreCliente=" + nombreCliente + ", fechaInicio=" + fechaInicio
					+ ", fechaFin=" + fechaFin + ", importe=" + importe + "]";
		}
		
		
		
		
		
		
		
		
		
}
