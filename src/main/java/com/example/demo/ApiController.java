package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {

    @PostMapping("/api/super-shy")
    @GetMapping("/api/super-shy") // 추가된 부분
    public String handleSuperShyRequest() {
        // POST 및 GET 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy 요청이 처리되었습니다.";
    }
}
