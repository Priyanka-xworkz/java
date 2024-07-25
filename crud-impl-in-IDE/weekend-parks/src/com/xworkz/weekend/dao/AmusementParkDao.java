package com.xworkz.weekend.dao;

import com.xworkz.weekend.dto.AmusementParkDto;

public class AmusementParkDao {
    AmusementParkDto dto;
    public boolean createAmusementParkDetails(AmusementParkDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto=dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please provide valid data");
        }
        return isDaoCreated;
    }
    public void getAmusementParkDetails(){
        System.out.println("id : " +dto.id);
        System.out.println("name : " +dto.name);
        System.out.println("place : "+dto.place);
        System.out.println("noOfGames : "+dto.noOfGames);
    }
}
