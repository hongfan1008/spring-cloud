package com.example.error;

import com.example.api.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }

    @Override
    public String re() {
        return "sdsdsdsdsdsd";
    }
}
