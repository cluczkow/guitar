package com.luczkow.guitar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by chris on 10/31/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map<String,Object> test() {

        Map<String,Object> test = new HashMap<>();
        test.put("id", UUID.randomUUID().toString());
        return test;
    }

}