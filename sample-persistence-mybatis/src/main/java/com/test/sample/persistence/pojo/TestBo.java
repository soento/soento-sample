package com.test.sample.persistence.pojo;

import com.soento.framework.core.lang.BaseObject;
import lombok.Getter;
import lombok.Setter;

public class TestBo extends BaseObject {
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String value;
}
