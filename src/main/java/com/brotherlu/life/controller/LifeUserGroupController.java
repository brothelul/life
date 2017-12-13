package com.brotherlu.life.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeUserGroup;
import com.brotherlu.life.service.LifeUserGroupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/user/group")
public class LifeUserGroupController {
    @Resource
    private LifeUserGroupService lifeUserGroupService;

    @PostMapping("/add")
    public Result add(LifeUserGroup lifeUserGroup) {
        lifeUserGroupService.save(lifeUserGroup);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        lifeUserGroupService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(LifeUserGroup lifeUserGroup) {
        lifeUserGroupService.update(lifeUserGroup);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        LifeUserGroup lifeUserGroup = lifeUserGroupService.findById(id);
        return ResultGenerator.genSuccessResult(lifeUserGroup);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LifeUserGroup> list = lifeUserGroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
