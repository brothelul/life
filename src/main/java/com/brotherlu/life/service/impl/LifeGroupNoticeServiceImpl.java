package com.brotherlu.life.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeGroupNoticeMapper;
import com.brotherlu.life.framework.constants.CommonConstant;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.model.LifeUserNoticeSummary;
import com.brotherlu.life.service.LifeGroupNoticeService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeGroupNoticeServiceImpl extends AbstractService<LifeGroupNotice> implements LifeGroupNoticeService {
    @Resource
    private LifeGroupNoticeMapper lifeGroupNoticeMapper;

	@Override
	public List<LifeUserNoticeSummary> getUserNotices(Map<String, Object> params) {
		params.put("typeNo", null);
		params.put("userNo", params.get("user_no"));
		params.put("modeType", CommonConstant.USER_NOTICES);
		params.put("startDate", null);
		params.put("endDate", null);	
		params.put("page", null);
		params.put("size", null);
		return lifeGroupNoticeMapper.getUserNotice(params);
	}

}
