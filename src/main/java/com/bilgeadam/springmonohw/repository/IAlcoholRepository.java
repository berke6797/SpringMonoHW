package com.bilgeadam.springmonohw.repository;

import com.bilgeadam.springmonohw.dto.response.FindAllAlcoholResponseDto;
import com.bilgeadam.springmonohw.repository.entity.Alcohol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlcoholRepository extends JpaRepository<Alcohol, Long> {

    @Query("select new com.bilgeadam.springmonohw.dto.response.FindAllAlcoholResponseDto(a.alcoholType,a.alcoholBrand,a.price) from Alcohol a where LOWER(a.alcoholType) like ?1%")
    List<FindAllAlcoholResponseDto> findAllByAlcoholType(String alcoholType);

}
