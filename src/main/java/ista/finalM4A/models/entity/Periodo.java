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
@Table(name="periodos")
@CrossOrigin(origins = "http://localhost:4200")
public class Periodo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="periodo_id")
	private List<Periodo_Carrera> periodo_carrera;
    
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="periodo_id")
	private List<Actividades> actividades;
    
	
	public List<Actividades> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividades> actividades) {
		this.actividades = actividades;
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

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}



	public List<Periodo_Carrera> getPeriodo_carrera() {
		return periodo_carrera;
	}

	public void setPeriodo_carrera(List<Periodo_Carrera> periodo_carrera) {
		this.periodo_carrera = periodo_carrera;
	}



	private static final long serialVersionUID = 1L;
}