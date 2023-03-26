package com.bilgeadam.springmonohw.controller;

import com.bilgeadam.springmonohw.dto.request.AlcoholUpdateRequestDto;
import com.bilgeadam.springmonohw.dto.response.FindAllAlcoholResponseDto;
import com.bilgeadam.springmonohw.repository.entity.Alcohol;
import com.bilgeadam.springmonohw.service.AlcoholService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static com.bilgeadam.springmonohw.constants.EndPoints.*;
@RestController
@RequestMapping(ALCOHOL)
@RequiredArgsConstructor
public class AlcoholController {
    private final AlcoholService alcoholService;

    @GetMapping(SAVE)
    public ResponseEntity<Alcohol> save(String alcoholType, String alcoholBrand, double alcoholContent, double price, int stock) {
        Alcohol savedAlcohol = alcoholService.save(alcoholType, alcoholBrand, alcoholContent, price, stock);
        return ResponseEntity.ok(savedAlcohol);
    }
    @GetMapping(FIND_ALL)
    public List<Alcohol>findAll(){
        return alcoholService.findAll();
    }

    @GetMapping(FIND_ALL_BY_ALCOHOL_TYPE)
    public List<FindAllAlcoholResponseDto> findAllByAlcoholType(String alcoholType){
        List<FindAllAlcoholResponseDto> alcoholList= alcoholService.findAllByAlcoholType(alcoholType);
        return alcoholList;
    }
        @GetMapping(UPDATE)
        public ResponseEntity<Void> update (AlcoholUpdateRequestDto updateDto){
            alcoholService.update(updateDto);
            return ResponseEntity.ok().build();
        }
    }



