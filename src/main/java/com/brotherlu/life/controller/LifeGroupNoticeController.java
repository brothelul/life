package com.brotherlu.life.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.service.LifeGroupNoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/group/notice")
public class LifeGroupNoticeController {
    @Resource
    private LifeGroupNoticeService lifeGroupNoticeService;

    @PostMapping("/add")
    public Result add(LifeGroupNotice lifeGroupNotice) {
        lifeGroupNoticeService.save(lifeGroupNotice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        lifeGroupNoticeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(LifeGroupNotice lifeGroupNotice) {
        lifeGroupNoticeService.update(lifeGroupNotice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        LifeGroupNotice lifeGroupNotice = lifeGroupNoticeService.findById(id);
        return ResultGenerator.genSuccessResult(lifeGroupNotice);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LifeGroupNotice> list = lifeGroupNoticeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
