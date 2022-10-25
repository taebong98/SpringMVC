package com.mvcDemo.mvcCore.coffee.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePostDto {
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "커피 이름은 공백이 아니어야 합니다.")
    private String coffeeName;

    @Price
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
