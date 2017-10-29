package com.soento.sample.business.a.service;

//import com.github.pagehelper.PageInfo;
import com.soento.sample.persistence.pojo.TestBo;

import java.util.List;

public interface TestService {

    List<TestBo> test();

//    PageInfo page();

    int insert();

    int insertTran();
}
