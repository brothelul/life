package com.brotherlu.life.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeCostMapper;
import com.brotherlu.life.framework.constants.CommonConstant;
import com.brotherlu.life.framework.core.AbstractService;
import com.brotherlu.life.model.LifeCost;
import com.brotherlu.life.model.LifeCostInfo;
import com.brotherlu.life.service.LifeCostService;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
@Service
@Transactional
public class LifeCostServiceImpl extends AbstractService<LifeCost> implements LifeCostService {
    @Resource
    private LifeCostMapper lifeCostMapper;

	@Override
	public List<Object> findLifeCostInfo(Integer typeNo, Integer userNo, String mode, Date startDate,
			Date endDate, Integer page, Integer size) {
		Map<String, Object> params = new HashMap<>();
		params.put("typeNo", typeNo);
		params.put("userNo", userNo);
		params.put("modeType", mode);
		params.put("startDate", startDate);
		params.put("endDate", endDate);	
		params.put("page", page);
		params.put("size", size);
		if(mode.equalsIgnoreCase(CommonConstant.QUERY_ORDERS)) {
			return lifeCostMapper.findCostInfo(params);
		} else if(mode.equalsIgnoreCase(CommonConstant.USER_COST)) {
			return lifeCostMapper.findUserTotalCost(params);
		}
		return null;
	}

}
