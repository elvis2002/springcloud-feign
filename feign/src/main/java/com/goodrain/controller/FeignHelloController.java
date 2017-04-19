package com.goodrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import com.goodrain.service.RemoteInvokerService;


@RestController
@RequestMapping("/feign")
public class FeignHelloController {

	@Autowired
    private RemoteInvokerService remoteInvokerService;

    @RequestMapping("index")
    public String remoteHello() {
    	return remoteInvokerService.remoteInvoker();
    }
}
