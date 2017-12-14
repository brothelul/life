package com.brotherlu.life.controller;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.constants.CommonConstant;
import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeCost;
import com.brotherlu.life.service.LifeCostService;
import com.brotherlu.life.utils.DateFormatUtil;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/cost")
public class LifeCostController {
	private Logger logger = LoggerFactory.getLogger(LifeCostController.class);
    @Resource
    private LifeCostService lifeCostService;

    /**
     * api request body:
     * 
     * {
     * 		"user_no":1,
     * 		"type_no":2,
     * 		"cost_money":3.3,
     * 		"cost_date":"2017-12-14 20:12:00",
     * 		"cost_desc":"买菜"
     * }
     * 
     * @param requestParams
     * @return
     * @throws ParseException
     */
    @PostMapping("/add")
    public Result add(@RequestBody Map<String,Object> requestParams) 
    		throws ParseException {
    	
    	Integer userNo = (Integer) requestParams.get("user_no");
    	Integer costType = (Integer) requestParams.get("type_no");
    	Float costMoney = (Float) requestParams.get("cost_money");
    	String costDateString = (String) requestParams.get("cost_date");
    	String costDesc = (String) requestParams.get("cost_desc");
    	
    	Date date = DateFormatUtil.string2Date(costDateString, CommonConstant.DATE_PATTERN);
    	if (userNo == null || costType == null || costMoney == null || date == null) {
    		logger.error(">>>>>>>>>>>>>>some feild were null in cost, userNo: "+userNo+", costType: "+costType+", costMoney: "+costMoney +", date: "+date+">>>>>>>>>>>>>>");
			return ResultGenerator.genFailResult("创建失败，某个关键字段为空。");
		}
    	
    	LifeCost lifeCost = new LifeCost();
    	lifeCost.setCostDate(date);
    	lifeCost.setCostDesc(costDesc);
    	lifeCost.setUserNo(userNo);
    	lifeCost.setCostType(costType);
    	lifeCost.setEntryId(userNo);
    	lifeCost.setEntryDate(new Date());
    	
        lifeCostService.save(lifeCost);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        lifeCostService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/update")
//    public Result update(LifeCost lifeCost) {
//        lifeCostService.update(lifeCost);
//        return ResultGenerator.genSuccessResult();
//    }

//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        LifeCost lifeCost = lifeCostService.findById(id);
//        return ResultGenerator.genSuccessResult(lifeCost);
//    }

    /**
     * api request body
     * 
     * {
     * 		"start_page":1,
     * 		"size":2,
     * 		"type_no":1,
     * 		"user_no":2,
     * 		"mode_type":"query_orders",
     * 		"start_date":"2017-11-20 20:12:00",
     * 		"end_date":"2017-12-14 20:12:00"
     * }
     * 
     * @param requestParams
     * @return
     * @throws ParseException
     */
    @PostMapping("/list")
    public Result list(@RequestBody Map<String,Object> requestParams) throws ParseException {
    	/** 获取分页信息 **/
    	Integer startPage = (requestParams.get("start_page") == null ? 0 : (int) requestParams.get("start_page"));
    	Integer size = (requestParams.get("size") == null ? 0 : (int) requestParams.get("size"));   	
    	Integer typeNo = (Integer) requestParams.get("type_no");
    	Integer userNo = (Integer) requestParams.get("user_no");
    	String modeType = (String) requestParams.get("mode_type");
    	String startDateString = (String) requestParams.get("start_date");
    	String endDateString = (String) requestParams.get("end_date");
    	
    	Date startDate = DateFormatUtil.string2Date(startDateString, CommonConstant.DATE_PATTERN);
    	Date endDate = DateFormatUtil.string2Date(endDateString, CommonConstant.DATE_PATTERN);
    	
        List<Object> list = lifeCostService.findLifeCostInfo(typeNo,
        		userNo, modeType, startDate,endDate,startPage,size);
        return ResultGenerator.genSuccessResult(list);
    }
}
