package com.example.consumer.springCloud.service;

import com.example.demo.model.TsWxUserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wancheng on 2018/7/5.
 */
@Component
@FeignClient(value = "provider1") //这里的name对应调用服务的spring.applicatoin.name
public interface ServiceAFeignClient {

    @RequestMapping("/wx/{id}")
    public TsWxUserInfo get(@PathVariable("id") Integer id);
}
