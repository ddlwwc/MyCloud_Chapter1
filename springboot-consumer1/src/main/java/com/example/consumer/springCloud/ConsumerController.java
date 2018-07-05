package com.example.consumer.springCloud;

import com.example.consumer.springCloud.service.ServiceAFeignClient;
import com.example.demo.model.TsWxUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wancheng on 2018/7/5.
 */

@RestController
public class ConsumerController {

    private static final String REST_URL_PREFIX = "PROVIDER1";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/wx/{id}")
    public TsWxUserInfo get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/wx/" + id, TsWxUserInfo.class);
    }

    @Autowired
    ServiceAFeignClient serviceAFeignClient;

    @RequestMapping(value = "/wx/{id}")
    public TsWxUserInfo feginget(@PathVariable("id") Integer id)
    {
        return serviceAFeignClient.get(id);
    }
}
