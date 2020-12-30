package com.peony.blackdata;

import com.peony.blackdata.process.BuyProductProcessService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.peony.blackdata.dao")
@EnableTransactionManagement
public class MybatisApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MybatisApplication.class);
        BuyProductProcessService buyService = context.getBean(BuyProductProcessService.class);
        buyService.buy();
    }
}
