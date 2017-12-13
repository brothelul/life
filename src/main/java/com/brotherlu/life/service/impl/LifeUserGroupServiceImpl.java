package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeUserGroupMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeUserGroup;
import com.brotherlu.life.service.LifeUserGroupService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeUserGroupServiceImpl extends AbstractService<LifeUserGroup> implements LifeUserGroupService {
    @Resource
    private LifeUserGroupMapper lifeUserGroupMapper;

}
