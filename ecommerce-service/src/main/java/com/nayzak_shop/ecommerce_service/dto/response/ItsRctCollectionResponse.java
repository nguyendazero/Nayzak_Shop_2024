package com.nayzak_shop.ecommerce_service.dto.response;

import com.nayzak_shop.ecommerce_service.enums.Collections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItsRctCollectionResponse {
    private Collections type;
    private String name;
    private String description;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
