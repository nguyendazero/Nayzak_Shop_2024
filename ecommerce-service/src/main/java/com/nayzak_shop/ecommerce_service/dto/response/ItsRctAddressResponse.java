package com.nayzak_shop.ecommerce_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItsRctAddressResponse {
    private long addressId;
    private String displayName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String streetAddress;
    private String zipCode;
    private ItsRctCountryResponse country;
    private ItsRctCityResponse city;
    private ItsRctDistrictResponse district;
    private ItsRctWardResponse ward;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
