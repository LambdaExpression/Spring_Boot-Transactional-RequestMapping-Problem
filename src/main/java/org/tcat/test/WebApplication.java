package org.tcat.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 用户服务 启动器
 *
 * @author Lin
 */
@EnableAsync(proxyTargetClass = true)
@EnableTransactionManagement
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WebApplication.class).web(true).run(args);
    }

}
