package net.yorksolutions.project2springboot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.InetAddress;
import java.net.UnknownHostException;


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


}
