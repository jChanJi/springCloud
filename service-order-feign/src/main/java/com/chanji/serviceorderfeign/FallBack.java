package com.chanji.serviceorderfeign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChanJi
 * @create 2018-08-07 10:17
 **/
@Component
public class FallBack implements FeignService {
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public List<User> addUsers(User user) {
        return null;
    }

    @Override
    public List<User> deleteUser(Integer id) {
        return null;
    }

    @Override
    public List<User> modifyUser(User user) {
        return null;
    }
}
