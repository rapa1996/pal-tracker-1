package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by RA371996 on 3/30/2018.
 */
@RestController
public class WelcomeController {
    private String msg;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message){
        this.msg = message;
    }
    @GetMapping("/")
    public String sayHello() {
        return this.msg;
    }
}
