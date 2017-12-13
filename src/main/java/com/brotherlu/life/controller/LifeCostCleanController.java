package com.brotherlu.life.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeCostClean;
import com.brotherlu.life.service.LifeCostCleanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/cost/clean")
public class LifeCostCleanController {
    @Resource
    private LifeCostCleanService lifeCostCleanService;

    @PostMapping("/add")
    public Result add(LifeCostClean lifeCostClean) {
        lifeCostCleanService.save(lifeCostClean);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        lifeCostCleanService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }

//    @PostMapping("/update")
//    public Result update(LifeCostClean lifeCostClean) {
//        lifeCostCleanService.update(lifeCostClean);
//        return ResultGenerator.genSuccessResult();
//    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        LifeCostClean lifeCostClean = lifeCostCleanService.findById(id);
        return ResultGenerator.genSuccessResult(lifeCostClean);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LifeCostClean> list = lifeCostCleanService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
