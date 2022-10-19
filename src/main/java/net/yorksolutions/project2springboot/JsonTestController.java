package net.yorksolutions.project2springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonTestController {
    private JsonTestService jsonTestService;
    public JsonTestController(JsonTestService jsonTestService){
        this.jsonTestService = jsonTestService;
    };
    @GetMapping("/test")
    public String test(){
        return this.jsonTestService.test();
    }

}
