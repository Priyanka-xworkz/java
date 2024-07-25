package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {
    NewsPaperDto dto;
    public boolean createNewsPaperDetails(NewsPaperDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto = dto;
            isDaoCreated = true;

        }else{
            System.out.println("Please Provide valid data");
        }
        return isDaoCreated;
    }
    public void getNewsPaperDetails(){
        System.out.println("companyName : " +dto.companyName);
        System.out.println("id : " +dto.id);
        System.out.println("noOfPages : " +dto.noOfPages);
        System.out.println("language : " +dto.language);
        System.out.println("price : " +dto.price);
    }
}
