package com.bilgeadam.springmonohw.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlcoholUpdateRequestDto {
    Long id;
    double price;
    int stock;
}
