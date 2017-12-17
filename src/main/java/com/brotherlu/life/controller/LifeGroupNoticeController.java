package com.brotherlu.life.controller;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brotherlu.life.framework.core.Result;
import com.brotherlu.life.framework.core.ResultGenerator;
import com.brotherlu.life.model.LifeGroupNotice;
import com.brotherlu.life.model.LifeUserNoticeSummary;
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

    /**
     *  {
     *  	"type_no":"",
     *  	"notice_name":"";
     *  	"notice_content":"",
     *  	"user_no":
     *  }
     * @param requestParams
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody Map<String, Object> requestParams) {
    	/** init the info of notice **/
    	Integer typeNo = (Integer) requestParams.get("type_no");
    	String noticeName = (String) requestParams.get("notice_name");
    	String noticeContent = (String) requestParams.get("notice_content");
    	Integer entryId = (Integer) requestParams.get("user_no");
    	
    	LifeGroupNotice lifeGroupNotice = new LifeGroupNotice();
    	lifeGroupNotice.setActive("Y");
    	lifeGroupNotice.setEntryDate(new Date());
    	lifeGroupNotice.setEntryId(entryId);
    	lifeGroupNotice.setNoticeContent(noticeContent);
    	lifeGroupNotice.setNoticeName(noticeName == null ? "Life 通知": noticeName);
    	lifeGroupNotice.setTypeNo(typeNo); 	
    	
        lifeGroupNoticeService.save(lifeGroupNotice);
        return ResultGenerator.genSuccessResult();
    }

/*    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        lifeGroupNoticeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(LifeGroupNotice lifeGroupNotice) {
        lifeGroupNoticeService.update(lifeGroupNotice);
        return ResultGenerator.genSuccessResult();
    }*/

//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        LifeGroupNotice lifeGroupNotice = lifeGroupNoticeService.findById(id);
//        return ResultGenerator.genSuccessResult(lifeGroupNotice);
//    }

    @PostMapping("/list")
    public Result list(@RequestBody Map<String, Object> requestParams) {
    	if (requestParams.get("user_no") == null) {
    		return ResultGenerator.genFailResult("user_no can not be null");
		}
        List<LifeUserNoticeSummary> list = lifeGroupNoticeService.getUserNotices(requestParams);
        return ResultGenerator.genSuccessResult(list);
    }
}
