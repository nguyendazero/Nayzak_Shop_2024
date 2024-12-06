package com.nayzak_shop.ecommerce_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddReviewRequest {
    private String fullName;
    private String email;
    private String review;
    private BigDecimal rating;
    private List<String> images = new ArrayList<>();

}
