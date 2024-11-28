package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.ICursoDao;
import ista.finalM4A.models.entity.Curso;


@Service
public class CursoServicelmpl implements ICursoService{
	
	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoDao.findAll();
	}

	@Override
	@Transactional
	public Curso save(Curso Curso) {
		// TODO Auto-generated method stub
		return cursoDao.save(Curso);
	}

	@Override
	@Transactional (readOnly=true)
	public Curso findById(Long id) {
		// TODO Auto-generated method stub
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoDao.deleteById(id);
		
	}

}
