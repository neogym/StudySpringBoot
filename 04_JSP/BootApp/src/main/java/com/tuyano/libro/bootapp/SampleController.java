package com.tuyano.libro.bootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/helo")
    public String helo() {
        return "helo";
    }
 
}

