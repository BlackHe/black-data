package com.peony.blackdata;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class BlackdataApplication {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR,"localhost:8848");
        properties.put(PropertyKeyConst.NAMESPACE,"peony");
        try {
            ConfigService configService = NacosFactory.createConfigService(properties);
            String content = configService.getConfig("data_source.yml", "dev", 30000);
            System.out.println(content);
        } catch (NacosException e) {
            e.printStackTrace();
        }

    }
}
