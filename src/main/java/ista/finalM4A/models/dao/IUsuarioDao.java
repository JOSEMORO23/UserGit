package ista.finalM4A.models.dao;

import org.springframework.data.repository.CrudRepository;

import ista.finalM4A.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
