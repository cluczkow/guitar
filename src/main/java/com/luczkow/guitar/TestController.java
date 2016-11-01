package com.luczkow.guitar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chris on 10/31/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "test";
    }

}