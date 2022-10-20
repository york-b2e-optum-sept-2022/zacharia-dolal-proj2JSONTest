package net.yorksolutions.project2springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@RestController
public class JsonTestController {
    private JsonTestService jsonTestService;
    HttpServletRequest request;



    public JsonTestController(JsonTestService jsonTestService) {
        this.jsonTestService = jsonTestService;
    }


    @GetMapping("/ip-address")
    public String getIpAddress() {
        return this.jsonTestService.getRequestIp();
    }

//    @GetMapping("/headers")
//    public HashMap getAllheaders(@RequestHeader Map<String,String> headers){
//        HashMap map = new HashMap();
//        headers.forEach((key,value) ->{
//            map.put(key,value);
//            System.out.println("Header Name: "+key+" Header Value: "+value);
//        });
//        return map;
//    }

    @GetMapping("/headers")
    public HashMap getAllheaders(@RequestHeader Map<String,String> headers){
        return this.jsonTestService.getAllheaders(headers);
    }


    @GetMapping("date")
    public HashMap getCurrentDate(){
        return this.jsonTestService.getCurrentTime();
    }


}
