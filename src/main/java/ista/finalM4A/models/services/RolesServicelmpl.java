package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.IRolesDao;
import ista.finalM4A.models.entity.Roles;

@Service
public class RolesServicelmpl implements IRolesService{
	
	@Autowired
	private IRolesDao rolesDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return (List<Roles>) rolesDao.findAll();
	}

	@Override
	@Transactional
	public Roles save(Roles Roles) {
		// TODO Auto-generated method stub
		return rolesDao.save(Roles);
	}

	@Override
	@Transactional (readOnly=true)
	public Roles findById(Long id) {
		// TODO Auto-generated method stub
		return rolesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolesDao.deleteById(id);
		
	}

}
