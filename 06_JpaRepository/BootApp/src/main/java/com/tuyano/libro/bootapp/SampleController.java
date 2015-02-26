package com.tuyano.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String helo(Model model,
            @RequestParam("name") String name,
            @RequestParam("mail") String mail,
            @RequestParam("tel") String tel,
            @RequestParam("age") int age) {
        MyData mydata = new MyData(name, mail, tel, age);
        repository.saveAndFlush(mydata);
        Iterable<MyData> list = repository.findAll();
        model.addAttribute("datas", list);
        return "helo";
    }
}

