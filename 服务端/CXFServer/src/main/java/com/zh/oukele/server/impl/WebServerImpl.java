package com.zh.oukele.server.impl;

import com.zh.oukele.server.WebServerI;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

@WebService(targetNamespace = "http://server.oukele.zh.com")
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class WebServerImpl implements WebServerI {

    // 模拟数据
    private static Map<String,String> map = new HashMap<>();

    static {
        map.put("AAAA","oukele");
        map.put("CCCC","欧可乐");
        map.put("BBBB","ouxiaole");
        map.put("DDDD","欧小乐");
        map.put("EEEE","欧乐乐");
    }

    @Override
    public String getInfo(String visitSystem, String visitId, String id) {
        log( visitSystem + " 的 " + visitId + " 携带参数id为[ " + id +" ]，来获取数据.....");
        String value = map.get(id);
        String msg = "";
        if( value == null || value.equals("") ){
            log("获取失败，数据库 没有 关于 [ "+ id +" ] 的 记录");
            msg = "{\"msg\":\"获取失败，数据库 没有 关于 [ "+ id +" ] 的 记录\",\"flag\":\"false\"}";
        }else {
            log("获取成功，记录为：" + value);
            msg = "{\"msg\":\"获取成功\",\"flag\":\"true\",\"data\":\""+ value +"\"}";
        }
        return msg;
    }

    // 模拟日志记录
    private static void log(String str){
        System.out.println(str);
    }

}
