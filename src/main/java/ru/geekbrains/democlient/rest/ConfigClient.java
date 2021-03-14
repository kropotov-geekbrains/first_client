package ru.geekbrains.democlient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class ConfigClient {

    @Value("${user.role}")
    private String role;

    @GetMapping(
            value = "/whoami/{username}",
            produces = TEXT_PLAIN_VALUE)
    public String whoAmI(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s...",
                username, role);
    }
}
