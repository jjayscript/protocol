package com.lys.protocol.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class ConsumeService {

    @Resource
    ProtocolService protocolService;
}
