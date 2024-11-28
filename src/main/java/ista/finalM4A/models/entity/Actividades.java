package ista.finalM4A.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="actividades")
@CrossOrigin(origins = "http://localhost:4200")
public class Actividades implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String descripcion;
	private Date fecha_entregado;
	private Date fecha_entrega_max;
	private String ruta_pdf;
	private Boolean activo;
    private Long rol_id;
    private Long periodo_id;
    
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="actividad_id")
	private List<Actividad_relacion> actividad_relacion;
	
	public List<Actividad_relacion> getActividad_relacion() {
		return actividad_relacion;
	}


	public void setActividad_relacion(List<Actividad_relacion> actividad_relacion) {
		this.actividad_relacion = actividad_relacion;
	}


	public Long getRol_id() {
		return rol_id;
	}


	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}


	public Long getPeriodo_id() {
		return periodo_id;
	}


	public void setPeriodo_id(Long periodo_id) {
		this.periodo_id = periodo_id;
	}


	public Boolean getActivo() {
		return activo;
	}


	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Date getFecha_entregado() {
		return fecha_entregado;
	}


	public void setFecha_entregado(Date fecha_entregado) {
		this.fecha_entregado = fecha_entregado;
	}


	public Date getFecha_entrega_max() {
		return fecha_entrega_max;
	}


	public void setFecha_entrega_max(Date fecha_entrega_max) {
		this.fecha_entrega_max = fecha_entrega_max;
	}


	public String getRuta_pdf() {
		return ruta_pdf;
	}


	public void setRuta_pdf(String ruta_pdf) {
		this.ruta_pdf = ruta_pdf;
	}


	private static final long serialVersionUID = 1L;
}