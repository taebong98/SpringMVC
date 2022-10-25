package com.mvcDemo.mvcCore.coffee.dto;

import com.mvcDemo.mvcCore.member.dto.NotSpace;

import javax.validation.constraints.Pattern;

public class CoffeePatchDto {
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "커피 이름은 공백이 아니어야 합니다.")
    private String coffeeName;

    @Price
    private int price;


    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
