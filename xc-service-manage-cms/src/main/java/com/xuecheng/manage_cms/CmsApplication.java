package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Version 1.0
 * @Author kang.jiang
 * @Created 2020年03月20  11:59:27
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年03月20  kang.jiang 1.0 create file
 */
@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms")//扫描实体类
public class CmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }

}
