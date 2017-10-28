package com.test.sample.web.a.pojo;

import com.soento.framework.core.lang.BaseObject;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

public class TestReq extends BaseObject {
    @Getter
    @Setter
    @NotBlank(message="{test.name.not.blank}")
    private String name;
    @Getter
    @Setter
    @NotBlank(message="{test.address.not.blank}")
    private String address;
}
