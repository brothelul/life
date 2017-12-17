package com.brotherlu.life.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeCostType;
import com.brotherlu.life.service.LifeCostTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/cost/type")
public class LifeCostTypeController {
    @Resource
    private LifeCostTypeService lifeCostTypeService;

    @PostMapping("/add")
    public Result add(LifeCostType lifeCostType) {
        lifeCostTypeService.save(lifeCostType);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        lifeCostTypeService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }

//    @PostMapping("/update")
//    public Result update(LifeCostType lifeCostType) {
//        lifeCostTypeService.update(lifeCostType);
//        return ResultGenerator.genSuccessResult();
//    }

//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        LifeCostType lifeCostType = lifeCostTypeService.findById(id);
//        return ResultGenerator.genSuccessResult(lifeCostType);
//    }

    @PostMapping("/list/{user_no}")
    public Result list(@PathVariable(name = "user_no") Integer user_no) {	
        List<LifeCostType> list = lifeCostTypeService.findCostTypes(user_no);
        return ResultGenerator.genSuccessResult(list);
    }
}
