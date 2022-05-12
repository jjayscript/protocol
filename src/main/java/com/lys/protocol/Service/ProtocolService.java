package com.lys.protocol.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProtocolService {

    @Autowired
    ConsumeService consumeService;

    public void proAop(){
        System.out.println("proAop");
    }
}
