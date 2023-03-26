package com.bilgeadam.springmonohw.service;

import com.bilgeadam.springmonohw.dto.request.AlcoholUpdateRequestDto;
import com.bilgeadam.springmonohw.dto.response.FindAllAlcoholResponseDto;
import com.bilgeadam.springmonohw.repository.IAlcoholRepository;
import com.bilgeadam.springmonohw.repository.entity.Alcohol;
import com.bilgeadam.springmonohw.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlcoholService extends ServiceManager<Alcohol, Long> {
    final private IAlcoholRepository iAlcoholRepository;

    public AlcoholService(IAlcoholRepository iAlcoholRepository) {
        super(iAlcoholRepository);
        this.iAlcoholRepository = iAlcoholRepository;
    }

    public Alcohol save(String alcoholType, String alcoholBrand,double alcoholContent,double price, int stock) {
        return iAlcoholRepository.save(Alcohol.builder()
                        .alcoholType(alcoholType)
                        .alcoholBrand(alcoholBrand)
                        .price(price)
                        .alcoholContent(alcoholContent)
                        .stock(stock)
                .build());
    }
    public List<Alcohol>findAll(){
        return iAlcoholRepository.findAll();
    }


    public List<FindAllAlcoholResponseDto> findAllByAlcoholType(String alcoholType){
        List<FindAllAlcoholResponseDto> alcoholList= iAlcoholRepository.findAllByAlcoholType(alcoholType);
        return alcoholList;
    }
    public Optional<Alcohol> findById(Long id){
        return iAlcoholRepository.findById(id);
    }

    public void update(AlcoholUpdateRequestDto updateDto){
        Optional<Alcohol> updatedAlcohol=iAlcoholRepository.findById(updateDto.getId());
        if (updatedAlcohol.isPresent()){
            updatedAlcohol.get().setPrice(updateDto.getPrice());
            updatedAlcohol.get().setStock(updateDto.getStock());
            iAlcoholRepository.save(updatedAlcohol.get());
        }
    }



}
