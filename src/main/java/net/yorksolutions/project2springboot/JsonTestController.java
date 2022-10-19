package net.yorksolutions.project2springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;

@RestController
public class JsonTestController {
    private JsonTestService jsonTestService;
    public JsonTestController(JsonTestService jsonTestService){
        this.jsonTestService = jsonTestService;
    };
//    @RequestMapping(
//            method = RequestMethod.GET,
//            value = "/ip-address",
//            produces = MediaType.TEXT_PLAIN_VALUE
//    )
//    @ResponseBody
//    public String getIpAddress(HttpServletRequest request){
//        String ip = JsonTestService.getRequestIp(request);
//        return "Your IP Address is: " + ip;
//    }
    @GetMapping("/ip-address")
    public  String getIpAddress(){
        return JsonTestService.getRequestIp();
}

}
