package com.brotherlu.life.dao;

import com.brotherlu.life.framework.core.Mapper;
import com.brotherlu.life.model.LifeUserLogin;

public interface LifeUserLoginMapper extends Mapper<LifeUserLogin> {
	Integer userLogin(String username, String password);
}