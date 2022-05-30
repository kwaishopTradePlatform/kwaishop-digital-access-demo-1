package com.kwaishop.digital.access.demo.proxy.request;

import java.util.List;

import lombok.Data;

/**
 * @author pengjianfei
 * Created on 2022-05-17
 */
@Data
public class EticketCheckAvailParam {

    /**
     * 卖家编号
     */
    private Long sellerId;
    /**
     * 买家编号
     */
    private Long buyerId;
    /**
     * 订单编号
     */
    private Long orderId;
    /**
     * 电子凭证类型 eticketType
     */
    private String eticketType;
    /**
     * eTicketList
     */
    private List<AvailableEticket> eTicketList;
}
