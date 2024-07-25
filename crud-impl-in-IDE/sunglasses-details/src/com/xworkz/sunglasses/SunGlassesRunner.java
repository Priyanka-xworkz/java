package com.xworkz.sunglasses;

import com.xworkz.sunglasses.dao.SunGlassesDao;
import com.xworkz.sunglasses.dto.SunGlassesDto;

public class SunGlassesRunner {
    public static void main(String[] args) {
        SunGlassesDto dto = new SunGlassesDto();
        dto.name = "Gucci";
        dto.id = 1;
        dto.type="Sports";
        dto.price = 200.00;

        SunGlassesDao sunGlassesDao = new SunGlassesDao();
        boolean ref = sunGlassesDao.CreateSunglassesDetails(dto);
        sunGlassesDao.getSunglassesDetails();
    }
}
