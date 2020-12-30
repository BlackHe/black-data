package com.peony.blackdata;

import com.peony.blackdata.process.BuyProductProcessService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.peony.blackdata.dao")
public class MybatisApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MybatisApplication.class);
        BuyProductProcessService buyService = context.getBean(BuyProductProcessService.class);
        buyService.buy();
    }
}
