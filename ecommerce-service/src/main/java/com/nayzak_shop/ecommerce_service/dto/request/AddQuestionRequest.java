package com.nayzak_shop.ecommerce_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddQuestionRequest {
    private String fullName;
    private String email;
    private String content;
    private List<String> images = new ArrayList<>();
}
