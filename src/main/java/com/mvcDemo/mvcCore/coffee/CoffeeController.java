package com.mvcDemo.mvcCore.coffee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
    @PostMapping
    public String postCoffee(@RequestParam("coffeeName") String coffeeName, @RequestParam("price") int price) {
        String response =
                "{\"" +
                    "coffeeName\":\""+coffeeName+"\"," +
                    "\"price\":\""+price+"\"" +
                "}";
        return response;
    }

    @GetMapping
    public String getCoffees() {
        return null;
    }
}
