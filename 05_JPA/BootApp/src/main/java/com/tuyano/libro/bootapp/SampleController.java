package com.tuyano.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @Autowired
    MyDataRepository repository;

    @RequestMapping("/helo")
    public String helo(Model model) {
        Iterable<MyData> list = repository.findAll();
        model.addAttribute("datas", list);
        return "helo";
    }
 
}

