package com.brotherlu.life.service;
import java.util.Date;
import java.util.List;

import com.brotherlu.life.framework.core.Service;
import com.brotherlu.life.model.LifeCost;
import com.brotherlu.life.model.LifeCostInfo;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
public interface LifeCostService extends Service<LifeCost> {
	List<Object> findLifeCostInfo(Integer typeNo, Integer userNo, 
			String mode, Date startDate, Date endDate, Integer page, Integer size);
}
