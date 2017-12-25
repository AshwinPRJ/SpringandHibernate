package com.project.app.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.bean.LoginBean;
import com.project.app.dao.ILoginDao;
import com.project.app.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginDao iLoginDao;

	public String saveLogin(LoginBean loginBean) {
		return iLoginDao.saveLogin(loginBean);
	}
}
