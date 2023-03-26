package com.bilgeadam.springmonohw.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Alcohol")
public class Alcohol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String alcoholType;
    String alcoholBrand;
    double alcoholContent;
    double price;
    int stock;


}
