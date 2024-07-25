package com.xworkz.agarbathi.dao;

import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiDao {
    AgarbathiDto dto;
    public boolean createAgarbathiDetails(AgarbathiDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto = dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please Provide valid data");
        }
        return isDaoCreated;
    }
    public void getAgarbathiDetails(){
        System.out.println("id : " +dto.id);
        System.out.println("brandName : " +dto.brandName);
        System.out.println("noOfSticks : " +dto.noOfSticks);
        System.out.println("fragrance : " +dto.fragrance);
        System.out.println("price : " +dto.price);
    }
}
