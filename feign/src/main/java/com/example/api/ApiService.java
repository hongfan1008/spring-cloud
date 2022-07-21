package com.example.api;

import com.example.error.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();
    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    String re();
}
