package com.mvcDemo.mvcCore.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
    @PostMapping
    public ResponseEntity postCoffee(@RequestParam("coffeeName") String coffeeName, @RequestParam("price") int price) {
        Map<String, Object> map = new HashMap<>();
        map.put("coffeeName", coffeeName);
        map.put("price", price);
        return new ResponseEntity(map, HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@RequestParam("coffee-id") Long coffeeId) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
