package com.RabbitMQ.MessagePassingOne;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
