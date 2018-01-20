package com.ams.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.ams.beans.UserBean;
import com.ams.dao.GenericDao;
import com.ams.entities.User;
import com.ams.service.UserService;
import com.ams.utils.BeanUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private GenericDao<User> genericDao;
	
	@Override
	public void add(UserBean userBean) {
	    genericDao.addEntity(BeanUtils.populateUser(userBean));
	}

	@Override
	public void update(UserBean userBean) {
		genericDao.updateEntity(BeanUtils.populateUser(userBean));		
	}

	@Override
	public void delete(UserBean userBean) {
	   genericDao.deleteEntity(BeanUtils.populateUser(userBean));		
	}

	@Override
	public List<UserBean> findAll() {		
		return BeanUtils.populateUserBeanList(genericDao.findAll(User.class));
	}

	@Override
	public UserBean findById(String userId) {		
		return BeanUtils.populateUserBean(genericDao.findEntityById(User.class,userId));
	}

}
