package com.zh.oukele.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://server.oukele.zh.com")
public interface WebServerI  {

    /**
     * 根据 id 查询数据
     * @param visitSystem 访问的系统应用名称
     * @param visitId 访问的id
     * @param id 查询 id
     * @return
     */
    String getInfo(@WebParam(name = "visitSystem") String visitSystem, @WebParam(name = "visitId") String visitId, @WebParam(name = "id") String id);


}
