package com.soento.sample.persistence.dao;

import com.soento.sample.persistence.pojo.TestBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao extends JpaSpecificationExecutor<TestBo>, JpaRepository<TestBo, String> {

    @Query("FROM TestBo")
    List<TestBo> list();
}
