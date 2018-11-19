package com.chanji.serviceorderfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ChanJi
 * @create 2018-08-06 9:38
 **/

@FeignClient(value = "service-member",fallback = FallBack.class)
@Component
public interface FeignService {
    @GetMapping("getAllUser")
    List<String> getAllUser();
}
