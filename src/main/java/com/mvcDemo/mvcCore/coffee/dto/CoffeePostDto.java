package com.mvcDemo.mvcCore.coffee.dto;

public class CoffeePostDto {
    private String coffeeName;
    private int price;

    public CoffeePostDto(String coffeeName, int price) {
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getPrice() {
        return price;
    }
}
