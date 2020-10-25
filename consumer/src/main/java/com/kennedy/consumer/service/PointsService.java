package com.kennedy.consumer.service;


import com.kennedy.consumer.entity.OrderBase;

public interface PointsService {

    public void increasePoints(OrderBase order);
}