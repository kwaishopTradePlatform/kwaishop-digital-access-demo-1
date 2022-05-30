package com.kwaishop.digital.access.demo.model;

import lombok.Data;

/**
 * @author pengjianfei
 * Created on 2022-05-19
 */
@Data
public class AvailableEticketDetail {
    private String code;
    private Long itemId;
    private Integer num;
    private String id;
    private Long buyerId;
    private Long leftNum;
    private String eticketType;
    private Long OrderId;
    private Long sellerId;
    private String displayStatus;
    private String token;
}
