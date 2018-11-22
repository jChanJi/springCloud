package com.chanji.serviceorderfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * add
     * @param user
     * @return
     */
    @PostMapping("addUser")
    public List<User> addUsers(User user){
        System.out.println(user.toString());
        return feignService.addUsers(user);
    }

    /**
     * delete
     * @param id
     * @return
     */
    @PostMapping("/deleteUser")
    public List<User> deleteUser(Integer id){
        return feignService.deleteUser(id);
    }


    @PostMapping("/modifyUser")
    public List<User> modify(User user){
        return feignService.modifyUser(user);
    }



    @GetMapping(value = "getAllUser",produces = "application/json;charset=utf-8")
    public List<User> getAllUsers() {
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
