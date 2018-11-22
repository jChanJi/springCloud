package com.chanji.serviceorderfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;

/**
 * @author ChanJi
 * @create 2018-08-06 9:38
 **/

@FeignClient(value = "service-member", fallback = FallBack.class)
@Component
public interface FeignService {
    @GetMapping("getAllUser")
    List<User> getAllUser();

    @PostMapping("addUser")
    List<User> addUsers(User user);

    @PostMapping("deleteUser")
    List<User> deleteUser(Integer id);

    @PostMapping("modifyUser")
    List<User> modifyUser(User user);
}
