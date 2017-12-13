package com.brotherlu.life.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeGroupNoticeMapper;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.service.LifeGroupNoticeService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeGroupNoticeServiceImpl extends AbstractService<LifeGroupNotice> implements LifeGroupNoticeService {
    @Resource
    private LifeGroupNoticeMapper lifeGroupNoticeMapper;

}
