package ista.finalM4A.models.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="actividad_relacion")
@CrossOrigin(origins = "http://localhost:4200")
public class Actividad_relacion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private Boolean estado;
	private String observacion;
	private String pdf;
	
	private Long actividad_id;
	private Long usuario_id;
    
	
	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getPdf() {
		return pdf;
	}


	public void setPdf(String pdf) {
		this.pdf = pdf;
	}


	public Long getActividad_id() {
		return actividad_id;
	}


	public void setActividad_id(Long actividad_id) {
		this.actividad_id = actividad_id;
	}


	public Long getUsuario_id() {
		return usuario_id;
	}


	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	private static final long serialVersionUID = 1L;

}
