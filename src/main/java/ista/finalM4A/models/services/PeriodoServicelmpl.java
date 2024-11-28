package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.IPeriodoDao;
import ista.finalM4A.models.entity.Periodo;

@Service

public class PeriodoServicelmpl implements IPeriodoService{
	
	@Autowired
	private IPeriodoDao periodoDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Periodo> findAll() {
		// TODO Auto-generated method stub
		return (List<Periodo>) periodoDao.findAll();
	}

	@Override
	@Transactional
	public Periodo save(Periodo Periodo) {
		// TODO Auto-generated method stub
		return periodoDao.save(Periodo);
	}

	@Override
	@Transactional (readOnly=true)
	public Periodo findById(Long id) {
		// TODO Auto-generated method stub
		return periodoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		periodoDao.deleteById(id);
		
	}

}
