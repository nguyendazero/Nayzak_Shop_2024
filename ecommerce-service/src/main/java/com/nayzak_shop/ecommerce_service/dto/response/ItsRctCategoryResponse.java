package com.nayzak_shop.ecommerce_service.dto.response;

import com.nayzak_shop.ecommerce_service.enums.Categories;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItsRctCategoryResponse {
    private long categoryId;
    private String name;
    private Categories type;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
