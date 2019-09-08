package com.zh.oukele.web;

import com.zh.oukele.server.WebServerI;
import com.zh.oukele.server.WebServerIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/getInfo")
public class TestController {

    @GetMapping
    public String getInfo(String id){
        WebServerIService webServerIService = new WebServerIService();
        WebServerI serverIPort = webServerIService.getWebServerIPort();
        String info = serverIPort.getInfo("xxx系统", "oukele", id);

        return info;
    }

}
