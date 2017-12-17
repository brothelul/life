package com.brotherlu.life.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherlu.life.dao.LifeCostTypeMapper;
import com.brotherlu.life.framework.constants.CommonConstant;
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

	@Override
	public List<LifeCostType> findCostTypes(Integer userNo) {
		Map<String, Object> params = new HashMap<>();
		params.put("typeNo", null);
		params.put("userNo", userNo);
		params.put("modeType", CommonConstant.USER_TYPES);
		params.put("startDate", null);
		params.put("endDate", null);	
		params.put("page", null);
		params.put("size", null);
		return lifeCostTypeMapper.findCostTypes(params);
	}

}
