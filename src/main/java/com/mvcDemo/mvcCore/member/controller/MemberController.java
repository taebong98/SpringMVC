package com.mvcDemo.mvcCore.member.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/members", produces = {MediaType.APPLICATION_JSON_VALUE})
public class MemberController {
    @PostMapping
    public String postMember(@RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("phone") String phone) {
        String response =
                "{\"" +
                        "email\":\""+email+"\"," +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + phone+
                        "\"}";
        return response;
    }

    @GetMapping
    public String getMembers() {
        return null;
    }
}
