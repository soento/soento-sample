package com.soento.sample.persistence.pojo;

import com.soento.framework.core.lang.Pojo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class TestBo extends Pojo {
    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "code")
    private String code;

    @Getter
    @Setter
    @Column(name = "value")
    private String value;
}
