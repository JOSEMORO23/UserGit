package ista.finalM4A.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ista.finalM4A.models.entity.Actividades;
import ista.finalM4A.models.services.IActividadesService;
import ista.finalM4A.models.services.FileStorageService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/api")

public class ActividadesController {
	
	@Autowired
	public IActividadesService actividadService;
	@GetMapping("/actividades")
	public List<Actividades> indext(){
		return actividadService.findAll();
	}
	
	@GetMapping("/actividades/{id}")
	public Actividades show(@PathVariable Long id) {
			return actividadService.findById(id);
			
	}
	
	@PostMapping("/actividades")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividades create(@RequestBody Actividades Actividades) {
		return actividadService.save(Actividades);
	}
	
	@PutMapping("/actividades/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Actividades Actividades) {
		Actividades.setId(id);
		Actividades actividadesSave = actividadService.save(Actividades);
		return ResponseEntity.ok(actividadesSave);
	}
	
	@DeleteMapping("/actividades/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		actividadService.delete(id);
		
	}
	
	@Autowired
    private IActividadesService actividadesService;

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/upload/{id}")
    public ResponseEntity<String> uploadFile(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        Actividades actividad = actividadesService.findById(id);

        if (actividad != null) {
            fileStorageService.store(file);
            actividad.setRuta_pdf(file.getOriginalFilename()); // Guarda el nombre del archivo en la entidad
            actividadesService.save(actividad);
            return ResponseEntity.ok("File uploaded successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Actividad not found");
        }
    }

    @GetMapping("/download/{filename:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        Resource file = fileStorageService.loadAsResource(filename);
        return ResponseEntity.ok()
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
            .body(file);
    }
    @DeleteMapping("/delete/{filename:.+}")
    public ResponseEntity<Map<String, String>> deleteFile(@PathVariable String filename) {
        try {
            fileStorageService.delete(filename);
            return ResponseEntity.ok(Collections.singletonMap("message", "File deleted successfully"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("message", "Failed to delete file: " + e.getMessage()));
        }
    }
}
