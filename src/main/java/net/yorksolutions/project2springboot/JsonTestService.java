package net.yorksolutions.project2springboot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import java.text.SimpleDateFormat;
 import java.time.LocalDate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JsonTestService {

    public  String getRequestIp() {
        InetAddress ip;

        String hostName = "";
        try {
            ip = InetAddress.getLocalHost();
            hostName = ip.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }

    @GetMapping("/headers")
    public HashMap getAllheaders(Map<String,String> headers){
        HashMap map = new HashMap();
        headers.forEach((key,value) ->{
            map.put(key,value);
            System.out.println("Header Name: "+key+" Header Value: "+value);
        });
        return map;
    }


    public HashMap<String,LocalDate> getCurrentTime(){
        LocalDate localDate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        HashMap map = new HashMap();
        map.put("Current Date", localDate);
        map.put("Current Time", localtime);
        return map;


    }



}
