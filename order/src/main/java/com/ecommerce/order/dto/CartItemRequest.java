package com.ecommerce.order.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemRequest {
    private String productId;
    private Integer quantity;
    private BigDecimal price;
}