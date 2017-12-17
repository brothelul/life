package com.brotherlu.life.dao;

import java.util.List;
import java.util.Map;

import com.brotherlu.life.framework.core.Mapper;
import com.brotherlu.life.model.LifeCostType;

public interface LifeCostTypeMapper extends Mapper<LifeCostType> {

	List<LifeCostType> findCostTypes(Map<String, Object> map);
}