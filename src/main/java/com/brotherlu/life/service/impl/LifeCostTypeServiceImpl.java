package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeCostTypeMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeCostType;
import com.brotherlu.life.service.LifeCostTypeService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeCostTypeServiceImpl extends AbstractService<LifeCostType> implements LifeCostTypeService {
    @Resource
    private LifeCostTypeMapper lifeCostTypeMapper;

}
