package io.amoe.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 10:31
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private BigDecimal wallet;
    private LocalDateTime createTime;
}
