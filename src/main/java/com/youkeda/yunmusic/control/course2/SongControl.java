package com.youkeda.yunmusic.control.course2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SongControl {
    @RequestMapping(value = "/song")
    public String getSong(@RequestParam(name="id",required = false)String songID){
        if (songID == null){
            songID = "1";
        }
        if (songID.equals("1")){
            return "course2/1.html";
        }else {
            return "course2/other.html";
        }
    }
}
