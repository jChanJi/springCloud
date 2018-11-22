package com.chanji.servicemember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
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

    public static List<User> users = new ArrayList<>();


    /**
     * add
     *
     * @param user
     * @return
     */
    @PostMapping("addUser")
    public List<User> addUsers(@RequestBody User user) {
        System.out.println(user.toString());
        users.add(user);
        return users;
    }


    /**
     * delete
     *
     * @param id
     * @return
     */
    @PostMapping("/deleteUser")
    public List<User> deleteUser(@RequestBody Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(users.get(i));
                i--;
            }
        }
        return users;
    }

    @PostMapping("/modifyUser")
    public List<User> modify(@RequestBody User user) {
        for (User u : users) {
            if (u.getId() == user.getId()) {
                User user1 = new User();
                user1.setId(user.getId());
                user1.setName(user.getName());
                users.remove(u);
                users.add(user1);
            }
        }
        return users;
    }

    /**
     * search
     *
     * @return
     */
    @GetMapping(value = "/getAllUser", produces = "application/json;charset=UTF-8")
    public List<User> getAllUser() {
        return users;
    }


    @GetMapping("getMemberService")
    public String getMemberService() {
        return "this is member service";
    }
}


