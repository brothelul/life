package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeUserLoginMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeUserLogin;
import com.brotherlu.life.service.LifeUserLoginService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeUserLoginServiceImpl extends AbstractService<LifeUserLogin> implements LifeUserLoginService {
    @Resource
    private LifeUserLoginMapper lifeUserLoginMapper;

	@Override
	public Integer userLogin(String username, String password) {
		return lifeUserLoginMapper.userLogin(username, password);
	}

}
