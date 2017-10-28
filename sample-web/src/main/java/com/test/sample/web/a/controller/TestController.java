package com.test.sample.web.a.controller;

//import com.github.pagehelper.PageInfo;
import com.soento.framework.core.consts.BaseMessageCode;
import com.soento.framework.core.support.MessageSourceAccessor;
import com.test.sample.business.a.service.TestService;
import com.test.sample.persistence.pojo.TestBo;
import com.test.sample.web.a.pojo.TestReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;


@Controller
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private MessageSourceAccessor msa;
    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView result = new ModelAndView("index");
        logger.debug("index");
        result.getModelMap().put("name", "张三");
        System.out.println(msa.getMessage(BaseMessageCode.SUCCESS));
        return result;
    }

    @RequestMapping("test")
    @ResponseBody
    public List<TestBo> test() {
        logger.debug("test");
        return testService.test();
    }

//    @RequestMapping("page")
//    @ResponseBody
//    public PageInfo page() {
//        logger.debug("page");
//        return testService.page();
//    }

    @RequestMapping("insert")
    @ResponseBody
    public int insert() {
        logger.debug("insert");
        return testService.insert();
    }

    @RequestMapping("insertTran")
    @ResponseBody
    public int insertTran() {
        logger.debug("insertTran");
        return testService.insertTran();
    }

    @RequestMapping("validate")
    @ResponseBody
    public Object validate(@Valid TestReq req) {
        logger.debug("validate");
        return "ddddddd";
    }
}
