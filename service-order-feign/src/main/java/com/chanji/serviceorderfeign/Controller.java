package com.chanji.serviceorderfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChanJi
 * @create 2018-08-06 9:41
 **/
@RestController
public class Controller {
    @Autowired
    FeignService feignService;

    @GetMapping(value = "getAllUserByFeign",produces = "application/json;charset=utf-8")
    public List<String> getAllUsers() {
        return feignService.getAllUser();
    }

    @GetMapping("/userInfo")
    public  String getUserInfo() {
        return "userInfo";
    }

    @GetMapping("getOrderService")
    public String getOrderService(){
        return "this is order service";
    }
}
