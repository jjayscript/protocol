package com.lys.protocol.ProtocolAop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProtocolAspectJ {

    @Pointcut("within(com.lys.protocol.Service.*)")
    public void Aop(){


    }
    @AfterThrowing("Aop()")
    public void beforeMethod(){
        try {
            System.out.println("Aop");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
