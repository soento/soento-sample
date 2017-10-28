package com.test.sample.persistence.pojo;

import com.soento.framework.core.lang.BaseObject;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class TestBo extends BaseObject {
    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "CODE")
    private String code;

    @Getter
    @Setter
    @Column(name = "VALUE")
    private String value;
}
