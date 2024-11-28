package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.IActividadesDao;
import ista.finalM4A.models.entity.Actividades;

@Service
public class ActividadesServicelmpl implements IActividadesService{
	@Autowired
	private IActividadesDao actividadesDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Actividades> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividades>) actividadesDao.findAll();
	}

	@Override
	@Transactional
	public Actividades save(Actividades Actividades) {
		// TODO Auto-generated method stub
		return actividadesDao.save(Actividades);
	}

	@Override
	@Transactional (readOnly=true)
	public Actividades findById(Long id) {
		// TODO Auto-generated method stub
		return actividadesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actividadesDao.deleteById(id);
		
	}

}
