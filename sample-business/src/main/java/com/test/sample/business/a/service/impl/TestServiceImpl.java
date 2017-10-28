package com.test.sample.business.a.service.impl;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

import com.soento.framework.core.consts.BaseMessageCode;
import com.soento.framework.core.exception.ClientException;
import com.soento.framework.core.exception.ServiceException;
import com.soento.framework.core.support.MessageSourceAccessor;
import com.test.sample.business.a.service.TestService;
import com.test.sample.business.common.BizMesageCode;
import com.test.sample.persistence.dao.TestDao;
import com.test.sample.persistence.pojo.TestBo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Autowired
    protected MessageSourceAccessor msa;
    @Autowired
    protected TestDao testDao;

    @Override
    public List<TestBo> test() {
        logger.debug("test");
        logger.debug(msa.getMessage(BaseMessageCode.SUCCESS));
        return testDao.list();
    }

//    @Override
//    public PageInfo page() {
//        PageHelper.startPage(2, 2);
//        logger.debug("page");
//        PageInfo pageInfo = new PageInfo(testDao.list());
//        return pageInfo;
//    }

    @Override
    public int insert() {
        int count = 0;
        TestBo testBo1 = new TestBo();
        testBo1.setCode("5");
        testBo1.setValue("5");
        testDao.saveAndFlush(testBo1);
        count++;

        if (true) {
            throw ClientException.build(BizMesageCode.E000001);
        }

        TestBo testBo2 = new TestBo();
        testBo2.setCode("6");
        testBo2.setValue("6");
        testDao.saveAndFlush(testBo2);
        count++;
        return count;
    }

    @Override
    @Transactional
    public int insertTran() {
        int count = 0;
        TestBo testBo1 = new TestBo();
        testBo1.setCode("7");
        testBo1.setValue("7");
        testDao.saveAndFlush(testBo1);
        count++;

        if (true) {
            throw ServiceException.build(BizMesageCode.E000002);
        }

        TestBo testBo2 = new TestBo();
        testBo2.setCode("8");
        testBo2.setValue("8");
        testDao.saveAndFlush(testBo2);
        count++;
        return count;
    }
}
