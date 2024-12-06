package com.nayzak_shop.ecommerce_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddToCartRequest {
    private long productId;
    private long quantity;
    private List<Long> variantIds = new ArrayList<>();
}
