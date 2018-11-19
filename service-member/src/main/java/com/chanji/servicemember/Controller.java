package com.chanji.servicemember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChanJi
 * @create 2018-07-27 11:02
 **/
@RestController
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/getAllUser",produces = "application/json;charset=UTF-8")
    public List<String> getAllUser() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        users.add("port:" + port);
        return users;
    }

    @GetMapping("getMemberService")
    public String getMemberService() {
        return "this is member service";
    }
}
