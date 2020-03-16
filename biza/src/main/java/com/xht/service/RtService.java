package com.xht.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="bizb")
@Service
public interface RtService {

    @GetMapping("/hello")
    String sayHello();
}
