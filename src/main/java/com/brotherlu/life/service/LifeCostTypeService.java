package com.brotherlu.life.service;
import java.util.List;

import com.brotherlu.life.framework.core.Service;
import com.brotherlu.life.model.LifeCostType;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
public interface LifeCostTypeService extends Service<LifeCostType> {
	List<LifeCostType> findCostTypes(Integer userNo);
}
