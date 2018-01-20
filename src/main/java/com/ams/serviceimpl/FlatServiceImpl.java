package com.ams.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.beans.FlatBean;
import com.ams.dao.GenericDao;
import com.ams.entities.Flat;
import com.ams.service.FlatService;
import com.ams.utils.BeanUtils;

@Service
public class FlatServiceImpl implements FlatService {

	@Autowired
	private GenericDao<Flat> genericDao;

	@Override
	public void add(FlatBean flatBean) {
		Flat flat = BeanUtils.populateFlat(flatBean);
		genericDao.addEntity(flat);
	}

	@Override
	public void update(FlatBean flatBean) {
		Flat flat = BeanUtils.populateFlat(flatBean);
		genericDao.updateEntity(flat);
	}

	@Override
	public void delete(FlatBean flatBean) {
		Flat flat = BeanUtils.populateFlat(flatBean);
		genericDao.deleteEntity(flat);
	}

	@Override
	public List<FlatBean> findAll() {
		System.out.println("service");
        List<Flat> flats = genericDao.findAll(Flat.class);
		return BeanUtils.populateFlatBeanList(flats);
	}

	@Override
	public FlatBean findById(String flatId) {
        Flat flat = genericDao.findEntityById(Flat.class, flatId);
		return BeanUtils.populateFlatBean(flat);
	}

}
