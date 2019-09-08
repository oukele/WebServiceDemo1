package com.zh.oukele.web;

import com.zh.oukele.server.WebServerI;
import com.zh.oukele.server.WebServerIService;

public class Test {

    public static void main(String[] args) {
        WebServerIService webServerIService = new WebServerIService();
        WebServerI webServerIPort = webServerIService.getWebServerIPort();

        String info = webServerIPort.getInfo("信息系统", "oukele", "AAAA");
        System.out.println(info);
    }

}
