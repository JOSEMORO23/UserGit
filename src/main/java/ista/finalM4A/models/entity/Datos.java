package ista.finalM4A.models.entity;

import ista.finalM4A.models.dao.IRolesDao;
import ista.finalM4A.models.dao.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;

@Component
public class Datos {

    @Autowired
    private IRolesDao rolesDao;

    @Autowired
    private IUsuarioDao usuarioDao;

    @PostConstruct
    public void init() {
        // Crear roles si no existen
        if (!rolesDao.findById(1L).isPresent()) {
            Roles adminRole = new Roles();
            adminRole.setId(1L);
            adminRole.setNombre("ADMIN");
            rolesDao.save(adminRole);
        }
        if (!rolesDao.findById(2L).isPresent()) {
            Roles directorRole = new Roles();
            directorRole.setId(2L);
            directorRole.setNombre("DIRECTOR");
            rolesDao.save(directorRole);
        }
        if (!rolesDao.findById(3L).isPresent()) {
            Roles tutorRole = new Roles();
            tutorRole.setId(3L);
            tutorRole.setNombre("TUTOR");
            rolesDao.save(tutorRole);
        }
        if (!rolesDao.findById(4L).isPresent()) {
            Roles tutorRole = new Roles();
            tutorRole.setId(4L);
            tutorRole.setNombre("DOCENTE");
            rolesDao.save(tutorRole);
        }



            Usuario usuario = new Usuario();
            usuario.setNombre("Nombre");
            usuario.setApellido("Apellido");
            usuario.setEmail("usuario@example.com");
            usuario.setTelefono("123456789");
            usuario.setFecha_nacimiento(Timestamp.valueOf("1990-01-01 00:00:00"));
            usuario.setCedula("admin");
            usuario.setRol_id(1L); // Asignar el rol ID
            usuario.setContrasena("admin");
            usuarioDao.save(usuario);
        
    }
}
