package com.xworkz.mobilephone.dao;

import com.xworkz.mobilephone.dto.MobilePhoneDto;

public class MobilePhoneDao {
    MobilePhoneDto dto;
    public boolean createMobileInfo(MobilePhoneDto dto){
        boolean isMobileInfoCreated=false;
        boolean isMobileRefIdCreated=false;
        boolean isContactNoAdded=false;
        boolean isContactNameAdded=false;

        if(dto != null){
            if(dto.getRefId()>0)
                isMobileRefIdCreated=true;
            else System.out.println("invalid ref id ");

            if(dto.getContactNo()>0)
                isContactNoAdded=true;
            else System.out.println("invalid contact number");

            if(dto.getContactName()!=null)
                isContactNameAdded=true;
            else System.out.println("invalid contact name");

        }else System.out.println("Invalid data......");

        if(isMobileRefIdCreated==true && isContactNoAdded==true && isContactNameAdded==true){
            this.dto=dto;
            isMobileInfoCreated=true;
        }
        return isMobileInfoCreated;
    }
    public void getDetails(){
        System.out.println("ref id is : " +dto.getRefId());
        System.out.println("contact number is : " +dto.getContactNo());
        System.out.println("contact name is : " +dto.getContactName());
    }
}
