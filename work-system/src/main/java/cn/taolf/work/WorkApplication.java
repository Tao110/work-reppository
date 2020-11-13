package cn.taolf.work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 陶利飞
 * @Date: 2020/10/25
 */
@SpringBootApplication
@MapperScan("cn.taolf.work.buttonsystem.mapper")//包扫描
public class WorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class,args);
    }
}
