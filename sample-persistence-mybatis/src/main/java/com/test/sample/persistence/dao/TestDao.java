package com.test.sample.persistence.dao;

import com.test.sample.persistence.pojo.TestBo;

import java.util.List;

public interface TestDao {

    List<TestBo> list();

    int saveAndFlush(TestBo testBo);
}
