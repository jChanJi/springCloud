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
    public List<String> getAllUser() {
        List<String> list = new ArrayList<>();
        list.add("fallback");
        return list;
    }
}
