package com.RabbitMQ.MessagePassingOne;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {
    private Order order;
    private String status;//progress,completed
    private String message;
}
