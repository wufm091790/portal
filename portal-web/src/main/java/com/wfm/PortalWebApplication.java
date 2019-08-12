package com.wfm;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.wfm")
@MapperScan("com.wfm.portaldao.mapper")
public class PortalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalWebApplication.class, args);
    }

}
