package com.brotherlu.life.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.brotherlu.life.framework.core.Mapper;
import com.brotherlu.life.model.LifeCost;
import com.brotherlu.life.model.LifeCostInfo;

public interface LifeCostMapper extends Mapper<LifeCost> {
	/**
	 *  根据存储过程查询用户的cost信息
	 * @param typeNo
	 * @param userNo
	 * @param model
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Object> findCostInfo(Map<String, Object> params);

	List<Object> findUserTotalCost(Map<String, Object> params);
}