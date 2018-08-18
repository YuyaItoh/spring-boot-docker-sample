package com.example.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.domain.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SampleController {
    private final UserRepository userRepository;

    @GetMapping(path = "/")
    public List<User> sample() {
        return userRepository.findAll();
    }
}
