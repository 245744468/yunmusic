package com.youkeda.yunmusic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping( path ="/query" )
    public  String query(){
        return "Hello Word";
    }
}
