package com.bilgeadam.springmonohw.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindAllAlcoholResponseDto {
    String alcoholType;
    String alcoholBrand;
    double price;
}
