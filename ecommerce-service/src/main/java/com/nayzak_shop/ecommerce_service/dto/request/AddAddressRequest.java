package com.nayzak_shop.ecommerce_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressRequest {
    private String displayName;
    private String firstname;
    private String lastName;
    private String email;
    private String phone;
    private String streetAddress;
    private String zipCode;
    private long countryId;
    private long cityId;
    private long districtId;
    private long wardId;
}
