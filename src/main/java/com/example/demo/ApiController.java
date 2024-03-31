package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping("/api/super-shy")
    public String handleSuperShyPostRequest() {
        // POST 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy POST 요청이 처리되었습니다.";
    }
}
