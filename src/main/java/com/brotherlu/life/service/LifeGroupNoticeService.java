package com.brotherlu.life.service;
import java.util.List;
import java.util.Map;

import com.brotherlu.life.framework.core.Service;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.model.LifeUserNoticeSummary;


/**
 * Created by CodeGenerator on 2017/12/13.
 */
public interface LifeGroupNoticeService extends Service<LifeGroupNotice> {

	List<LifeUserNoticeSummary> getUserNotices(Map<String, Object> requestParams);

}
