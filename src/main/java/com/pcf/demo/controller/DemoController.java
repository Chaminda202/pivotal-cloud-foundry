package com.pcf.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping(value = "/hello")
    public String helloWorld(){
        LOGGER.info("Call hello world method");
        return "Hello World...!!!";
    }

    @GetMapping(value = "/address")
    public String currentIpAddress() throws UnknownHostException {
        LOGGER.info("Call current ip address method");
        return InetAddress.getLocalHost().getHostAddress();
    }
}
