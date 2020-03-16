package com.xht.controller;
import com.xht.service.RtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello1Controller {

    @Autowired
    private RtService rtService;

    /**
     * 示例方法
     *
     * @return
     */

    @GetMapping(name="sayHello1")
    public String sayHello1() {
        return rtService.sayHello();
    }

}
