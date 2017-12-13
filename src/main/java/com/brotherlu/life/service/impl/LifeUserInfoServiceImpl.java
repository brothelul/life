package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeUserInfoMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeUserInfo;
import com.brotherlu.life.service.LifeUserInfoService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeUserInfoServiceImpl extends AbstractService<LifeUserInfo> implements LifeUserInfoService {
    @Resource
    private LifeUserInfoMapper lifeUserInfoMapper;

}
