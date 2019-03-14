package com.example.circleci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ASM")
public class ASMcontroller
{
    @GetMapping("test")
    public String test() {
    return "Coucou petite peruche";

    }
}