package com.hithesh.embeddedserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @Autowired
    private ServletWebServerApplicationContext webServerAppCtxt;

    @GetMapping("/getServerName")
    public String getServerName(){
        return webServerAppCtxt.getWebServer().toString();
    }
}
