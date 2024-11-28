package ista.finalM4A.models.entity;

import java.io.Serializable;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="periodos_carreras")
@CrossOrigin(origins = "http://localhost:4200")
public class Periodo_Carrera implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long periodo_id;
    private Long carrera_id;

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPeriodo_id() {
		return periodo_id;
	}

	public void setPeriodo_id(Long periodo_id) {
		this.periodo_id = periodo_id;
	}

	public Long getCarrera_id() {
		return carrera_id;
	}

	public void setCarrera_id(Long carrera_id) {
		this.carrera_id = carrera_id;
	}


}
