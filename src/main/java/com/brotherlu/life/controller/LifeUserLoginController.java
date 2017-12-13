package com.brotherlu.life.controller;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeUserLogin;
import com.brotherlu.life.service.LifeUserLoginService;

/**
* Created by CodeGenerator on 2017/12/13.
*/
@RestController
@RequestMapping("/life/user")
public class LifeUserLoginController {
    @Resource
    private LifeUserLoginService lifeUserLoginService;

    @PostMapping("/login/add")
    public Result add(LifeUserLogin lifeUserLogin) {
        lifeUserLoginService.save(lifeUserLogin);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        lifeUserLoginService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }

    @PostMapping("/login/update")
    public Result update(LifeUserLogin lifeUserLogin) {
        lifeUserLoginService.update(lifeUserLogin);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        LifeUserLogin lifeUserLogin = lifeUserLoginService.findById(id);
//        return ResultGenerator.genSuccessResult(lifeUserLogin);
//    }

//    @PostMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
//        PageHelper.startPage(page, size);
//        List<LifeUserLogin> list = lifeUserLoginService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }
    
    @PostMapping("/login")
    public Result login(@RequestBody Map<String, Object> requestParams) {
    	String username = (String) requestParams.get("username");
    	String password = (String) requestParams.get("password");
    	if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return ResultGenerator.genFailResult("用户名和密码不能为空");
		}
        Integer userNo = lifeUserLoginService.userLogin(username, password);
        if(userNo == null) {
        	return ResultGenerator.genFailResult("用户名和密码和密码不匹配");
        }
        return ResultGenerator.genSuccessResult(userNo);
    }
}
