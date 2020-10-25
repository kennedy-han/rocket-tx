package com.kennedy.producer.controller;

import com.kennedy.producer.entity.OrderBase;
import com.kennedy.producer.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description 生产者，调用createOrder() 之后，使用 producer发消息
 * @Author kennedyhan
 * @Date 2020/10/25 0025 18:54
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/create-order")
    public void createOrder(@RequestBody OrderBase order) throws MQClientException {
        orderService.createOrder(order);
    }
}
