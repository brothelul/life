package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeCostCleanMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeCostClean;
import com.brotherlu.life.service.LifeCostCleanService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeCostCleanServiceImpl extends AbstractService<LifeCostClean> implements LifeCostCleanService {
    @Resource
    private LifeCostCleanMapper lifeCostCleanMapper;

}
