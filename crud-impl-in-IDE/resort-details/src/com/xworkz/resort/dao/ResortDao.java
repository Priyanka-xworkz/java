package com.xworkz.resort.dao;

import com.xworkz.resort.dto.ResortDto;

public class ResortDao {

    ResortDto dto;
    public boolean createResortDetails(ResortDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto=dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please Provide valid data");
        }
        return isDaoCreated;

    }
    public void getResortDetails(){
        System.out.println("areaInSqrt : " +dto.areaInSqrt);
        System.out.println("propertyName : " +dto.propertyName);
        System.out.println("ownerName : " +dto.ownerName);
        System.out.println("noOfRooms : " +dto.noOfRooms);
        System.out.println("id : " +dto.id);
    }
}
