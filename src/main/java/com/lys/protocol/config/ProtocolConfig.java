package com.lys.protocol.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lys.protocol")
@MapperScan(basePackages = {"com.lys.mybatis.MapperDao"})
public class ProtocolConfig {
}
