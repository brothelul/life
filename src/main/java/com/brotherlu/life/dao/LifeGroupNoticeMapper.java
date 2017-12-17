package com.brotherlu.life.dao;

import java.util.List;
import java.util.Map;

import com.brotherlu.life.framework.core.Mapper;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.model.LifeUserNoticeSummary;

public interface LifeGroupNoticeMapper extends Mapper<LifeGroupNotice> {

	List<LifeUserNoticeSummary> getUserNotice(Map<String, Object> params);
}