package com.yun;

import feign.Body;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "eureka-service")
public interface TestClient {
    @PostMapping(path = "/Hello/World")
    String testFeign(@RequestBody String str);

    @GetMapping(path = "/Hello/World2")
    String testFeign2();
}
