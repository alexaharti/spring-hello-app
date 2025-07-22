package com.example.spring_hello_app;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class MRestController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World from Spring!";
    }

    @GetMapping("/students")
    public List<String> getStudents() {
        return List.of("Adrian Cojocaru", "Viorel Balan", "Marian Botnarenco");
    }

    @GetMapping("/info")
    public String getAppInfo() {
        return "Aplicatie Spring Boot cu autentificare de baza si endpointurile: '/info', '/students', '/hello'.";
    }

}
