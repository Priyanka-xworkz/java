package com.xworkz.garden;

import com.xworkz.garden.dao.GardenDao;
import com.xworkz.garden.dto.GardenDto;

public class GardenRunner {

    public static void main(String[] args) {
        GardenDto dto = new GardenDto();
        dto.id = 1;
        dto.name = "JP park";
        dto.place = "Mathikere";

        GardenDao gardenDao = new GardenDao();
        boolean ref = gardenDao.createGardenDetails(dto);
        gardenDao.getGardenDetails();
    }
}
