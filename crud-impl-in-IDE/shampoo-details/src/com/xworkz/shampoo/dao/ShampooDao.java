package com.xworkz.shampoo.dao;

import com.xworkz.shampoo.dto.ShampooDto;

public class ShampooDao {
    ShampooDto dto;
    public boolean createShampooDetails(ShampooDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto = dto;
            isDaoCreated = true;
        }else{
            System.out.println("Please provide valid details");
        }
        return isDaoCreated;
    }
    public void getShampooDetails(){
        System.out.println("brandName : " +dto.brandName);
        System.out.println("qty : " +dto.qty);
        System.out.println("type : " +dto.type);
        System.out.println("prize : " +dto.prize);
        System.out.println("mgfDate : " +dto.mgfDate);
        System.out.println("expDate : " +dto.expDate);
    }
}
