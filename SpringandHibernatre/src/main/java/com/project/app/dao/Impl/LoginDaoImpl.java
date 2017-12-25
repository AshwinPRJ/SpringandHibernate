package com.project.app.dao.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.app.bean.LoginBean;
import com.project.app.dao.ILoginDao;
@Repository
public class LoginDaoImpl implements ILoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public String saveLogin(LoginBean loginBean) {
		sessionFactory.getCurrentSession().save(loginBean);
	      return "Saved Successfully";
	}

}
