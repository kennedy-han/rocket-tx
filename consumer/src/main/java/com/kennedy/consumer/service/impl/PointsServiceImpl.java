package com.kennedy.consumer.service.impl;

import com.kennedy.consumer.dao.TblPointsDao;
import com.kennedy.consumer.entity.OrderBase;
import com.kennedy.consumer.entity.TblPoints;
import com.kennedy.consumer.service.PointsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PointsServiceImpl implements PointsService {

    @Autowired
    TblPointsDao pointsMapper;

    @Override
    public void increasePoints(OrderBase order) {
        
        //入库之前先查询，实现幂等
//        if (pointsMapper.getByOrderNo(order.getOrderNo())>0){
//            log.info("积分添加完成，订单已处理。{}",order.getOrderNo());
//        }else{
            TblPoints points = new TblPoints();
            points.setUserId(1L);
            points.setOrderNo("wo");
            points.setPoints(10);
            points.setRemarks("商品消费共10元，获得积分"+points.getPoints());
            pointsMapper.insert(points);
            log.info("已为订单号码{}增加积分。",points.getOrderNo());
//        }
    }
}