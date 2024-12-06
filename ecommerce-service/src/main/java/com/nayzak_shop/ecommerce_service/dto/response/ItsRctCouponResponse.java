package com.nayzak_shop.ecommerce_service.dto.response;

import com.nayzak_shop.ecommerce_service.enums.CouponStatus;
import com.nayzak_shop.ecommerce_service.enums.CouponType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItsRctCouponResponse {
    private long couponId;
    private String code;
    private CouponType type;
    private LocalDateTime startDate;
    private BigDecimal discount;
    private LocalDateTime endDate;
    private BigDecimal minSpend;
    private BigDecimal maxSpend;
    private CouponStatus status;
}
