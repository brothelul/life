package com.brotherlu.life.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeUserInfo;
import com.brotherlu.life.service.LifeUserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/user/info")
public class LifeUserInfoController {
    @Resource
    private LifeUserInfoService lifeUserInfoService;

    @PostMapping("/add")
    public Result add(LifeUserInfo lifeUserInfo) {
        lifeUserInfoService.save(lifeUserInfo);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        lifeUserInfoService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }

    @PostMapping("/update")
    public Result update(LifeUserInfo lifeUserInfo) {
        lifeUserInfoService.update(lifeUserInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        LifeUserInfo lifeUserInfo = lifeUserInfoService.findById(id);
        return ResultGenerator.genSuccessResult(lifeUserInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LifeUserInfo> list = lifeUserInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
