package com.mvcDemo.mvcCore.order;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @PostMapping
    public String postOrder(@RequestParam("memberId") Long memberId, @RequestParam("coffeeId") Long coffeeId) {
        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\"," +
                        "\"coffeeId\":\""+coffeeId+"\"" +
                        "}";
        return response;
    }

    @GetMapping("/{order-id}")
    public String getOrder(@PathVariable("order-id") long orderId) {
        System.out.println("# orderId: " + orderId);

        // not implementation
        return null;
    }

    @GetMapping
    public String getOrders() {
        System.out.println("# get Orders");

        // not implementation
        return null;
    }
    
}
