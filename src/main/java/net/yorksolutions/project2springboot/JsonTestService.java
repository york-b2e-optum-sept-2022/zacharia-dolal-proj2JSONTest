package net.yorksolutions.project2springboot;

import org.springframework.stereotype.Service;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;

@Service
public class JsonTestService {

    public static String getRequestIp() {
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
