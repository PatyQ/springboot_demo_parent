package com.jm.springboot_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.jm")
@MapperScan({"com.jm.mapper","com.cy"})
@EnableSwagger2
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //设置Api文档的基本信息
                .apiInfo(new ApiInfoBuilder()
                        .title("新闻项目的接口Api文档")
                        .description("用来提供后台新闻项目的各种接口描述")
                        .contact(new Contact("Ken", "http://www.baidu.com", "12312312@qq.com"))
                        .termsOfServiceUrl("http://www.jd.com")
                        .version("1.0")
                        .build()
                ).select()
                //指明去哪个包下找API
                .apis(RequestHandlerSelectors.basePackage("com.jm.controller"))
                .build();
    }
}
