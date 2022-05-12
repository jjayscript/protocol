package com.lys.protocol;

import com.lys.protocol.Service.ProtocolService;
import com.lys.protocol.config.ProtocolConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class protocol  {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.register(ProtocolConfig.class);
        annotationConfigApplicationContext.refresh();
        ProtocolService bean = annotationConfigApplicationContext.getBean(ProtocolService.class);
        bean.proAop();
        DispatcherServlet dispatcherServlet=new DispatcherServlet();

        //SpringApplication.run(protocol.class, args);
        
    }
}
