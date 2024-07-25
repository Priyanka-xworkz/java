package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.SimCardDto;

public class SimCardDao {
    SimCardDto dto;
    public boolean createSimCardDetails(SimCardDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto = dto;
            isDaoCreated = true;

        }else{
            System.out.println("Please provide valid data");
        }
        return isDaoCreated;

    }
    public void getSimCardDetails(){
        System.out.println("name is : " +dto.name);
        System.out.println("plan : " +dto.plan);
        System.out.println("id : " +dto.id);
    }
}
