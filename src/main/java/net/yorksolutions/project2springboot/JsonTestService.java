package net.yorksolutions.project2springboot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
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



    public HashMap<String,LocalDate> getCurrentTime(){
        LocalDate localDate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        HashMap map = new HashMap();
        map.put("Current Date", localDate);
        map.put("Current Time", localtime);
//
//
//        Date date = new Date();
//        String strDateFormat = "hh:MM:SS a";
//        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//        String formattedDate = dateFormat.format(date);
        return map;


    }



}
