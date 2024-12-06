package com.nayzak_shop.ecommerce_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItsRctCartResponse {
    private long cartId;
    private long quantity;
    private ItsRctProductResponse product;
    private List<ItsRctProductVariantGroupResponse> productVariants = new ArrayList<>();
}
