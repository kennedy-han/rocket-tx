package com.kennedy.consumer.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * tbl_points
 * @author 
 */
@Data
public class TblPoints implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 积分
     */
    private Integer points;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}