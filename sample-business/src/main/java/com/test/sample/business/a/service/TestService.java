package com.test.sample.business.a.service;

//import com.github.pagehelper.PageInfo;
import com.test.sample.persistence.pojo.TestBo;

import java.util.List;

public interface TestService {

    List<TestBo> test();

//    PageInfo page();

    int insert();

    int insertTran();
}
