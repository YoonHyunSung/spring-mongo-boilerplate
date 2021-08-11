package net.spring.app.demo;

import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    public String home(){
        return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
    }
}
