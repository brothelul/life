package com.brotherlu.life.controller;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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
    @Resource
    private LifeCostService lifeCostService;

    @PostMapping("/add")
    public Result add(LifeCost lifeCost) {
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

    @PostMapping("/list")
    public Result list(@RequestBody Map<String,Object> requestParams) throws ParseException {
    	/** 获取分页信息 **/
    	Integer startPage = (requestParams.get("start_page") == null ? 0 : (int) requestParams.get("start_page"));
    	Integer size = (requestParams.get("size") == null ? 0 : (int) requestParams.get("size"));   	
    	Integer typeNo = (Integer) requestParams.get("type_no");
    	Integer userNo = (Integer) requestParams.get("user_no");
    	String modelType = (String) requestParams.get("model_type");
    	String startDateString = (String) requestParams.get("start_date");
    	String endDateString = (String) requestParams.get("end_date");
    	
    	Date startDate = DateFormatUtil.string2Date(startDateString, CommonConstant.DATE_PATTERN);
    	Date endDate = DateFormatUtil.string2Date(endDateString, CommonConstant.DATE_PATTERN);
    	
        List<Object> list = lifeCostService.findLifeCostInfo(typeNo,
        		userNo, modelType, startDate,endDate,startPage,size);
        return ResultGenerator.genSuccessResult(list);
    }
}
