package cn.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
    /**
     * 使用RestTemplate实现跨服务调用，这里将获取一个RestTemplate对象交由spring管理
     * @return org.springframework.web.client.RestTemplate
     * @author czj
     * @date 2022/12/4 20:59
     */

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}