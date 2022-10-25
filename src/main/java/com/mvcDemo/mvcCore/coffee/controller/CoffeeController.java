package com.mvcDemo.mvcCore.coffee.controller;

import com.mvcDemo.mvcCore.coffee.dto.CoffeePatchDto;
import com.mvcDemo.mvcCore.coffee.dto.CoffeePostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/v1/coffees")
@Validated
public class CoffeeController {
    @PostMapping
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        return new ResponseEntity(coffeePostDto, HttpStatus.OK);
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") @Min(1) Long coffeeId, @Valid @RequestBody CoffeePatchDto coffeePatchDto){
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
