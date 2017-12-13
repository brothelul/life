package com.brotherlu.life.service;
import com.brotherlu.life.framework.core.Service;
import com.brotherlu.life.model.LifeUserLogin;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
public interface LifeUserLoginService extends Service<LifeUserLogin> {
	Integer userLogin(String username, String password);
}
