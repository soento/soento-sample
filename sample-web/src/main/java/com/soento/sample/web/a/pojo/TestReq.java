package com.soento.sample.web.a.pojo;

import com.soento.framework.core.lang.Pojo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

public class TestReq extends Pojo {
    @Getter
    @Setter
    @NotBlank(message = "{test.name.not.blank}")
    private String name;
    @Getter
    @Setter
    @NotBlank(message = "{test.address.not.blank}")
    private String address;
}
