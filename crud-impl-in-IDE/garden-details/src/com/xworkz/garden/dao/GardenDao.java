package com.xworkz.garden.dao;

import com.xworkz.garden.dto.GardenDto;

public class GardenDao {

    GardenDto dto;
    public boolean createGardenDetails(GardenDto dto){
        boolean isDaoCreated = false;
        if(dto != null){
            this.dto = dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please Provide valid data");
        }
        return isDaoCreated;
    }
    public void getGardenDetails(){
        System.out.println("id : " +dto.id);
        System.out.println("name : " +dto.name);
        System.out.println("place : " +dto.place);

    }
}
