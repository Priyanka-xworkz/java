package com.xworkz.battery.dao;

import com.xworkz.battery.dto.BatteryDto;

public class BatteryDao {
    BatteryDto dto;
    public boolean createBatteryDetails(BatteryDto dto){
        boolean isDaoCreated= false;
        if(null != dto){
            this.dto = dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please Provide Valid Data");
        }
        return isDaoCreated;
    }
    public void getBatteryDetails(){
        System.out.println("id : " +dto.id);
        System.out.println("name : " +dto.name);
        System.out.println("weight : " +dto.weight);
    }
}
