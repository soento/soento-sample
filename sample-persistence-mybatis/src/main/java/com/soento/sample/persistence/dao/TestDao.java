package com.soento.sample.persistence.dao;

import com.soento.sample.persistence.pojo.TestBo;

import java.util.List;

public interface TestDao {

    List<TestBo> list();

    int saveAndFlush(TestBo testBo);
}
