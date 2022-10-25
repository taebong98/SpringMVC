package com.mvcDemo.mvcCore.coffee.controller;

import com.mvcDemo.mvcCore.coffee.dto.CoffeePatchDto;
import com.mvcDemo.mvcCore.coffee.dto.CoffeePostDto;
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
    public ResponseEntity postCoffee(@RequestBody CoffeePostDto coffeePostDto) {
        return new ResponseEntity(coffeePostDto, HttpStatus.OK);
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") Long coffeeId, @RequestBody CoffeePatchDto coffeePatchDto){
        coffeePatchDto.setCoffeeId(coffeeId);
        coffeePatchDto.setCoffeeName("카페라떼");
        return new ResponseEntity<>(coffeePatchDto, HttpStatus.OK);
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
