package org.example.service;

import org.example.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.logstash.logback.argument.StructuredArguments;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    public void createOrder(Order order) {
        log.info("Order created",
                StructuredArguments.keyValue("orderId", order.getId()),
                StructuredArguments.keyValue("amount", order.getAmount()));
    }
}
