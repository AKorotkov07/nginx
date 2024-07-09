package ru.netology.nginx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/authorize")
    public String authorize(@RequestParam String user, @RequestParam String password) {
        if ("admin".equals(user) && "password123".equals(password)) {
            return "Авторизация успешна";
        } else {
            return "Неверные учетные данные";
        }
    }
}