package com.nayzak_shop.account_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private long id;
    private String fullName;
    private String haibazoAlias;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String message;
}
