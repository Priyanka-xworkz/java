package com.xworkz.sunglasses.dao;

import com.xworkz.sunglasses.dto.SunGlassesDto;

public class SunGlassesDao {
    SunGlassesDto dto;
    public Boolean CreateSunglassesDetails(SunGlassesDto dto) {
        boolean isDaoCreated = false;
            if(null != dto) {
                this.dto = dto;
                isDaoCreated = true;
            }else{
                System.out.println("Please Provide Valid Data");
            }
            return isDaoCreated;
    }
    public  void getSunglassesDetails(){
        System.out.println("brandName : " +dto.name);
        System.out.println("id : " +dto.id);
        System.out.println("type : " +dto.type);
        System.out.println("price : " +dto.price);

    }
}
