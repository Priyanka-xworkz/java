package com.xworkz.carddetails.dao;

import com.xworkz.carddetails.dto.CardDto;

public class CardDao {
    CardDto dto;
    public boolean createCardInfo(CardDto dto){
    boolean isCardInfoCreated=false;
    boolean isCardIdAdded=false;
    boolean isCardHolderNameAdded=false;
    boolean isCardNoAdded= false;
    boolean isCardExpiryDateAdded=false;
    boolean isCardCvvNoAdded=false;
    boolean isCardProviderNameAdded=false;

    if(dto != null){
        if (dto.getCardId()>0)
            isCardIdAdded=true;
        else System.out.println("provide card id number");

        if(dto.getCardHolderName()!=null)
            isCardHolderNameAdded=true;
        else System.out.println("provide card holder name ");

        if(dto.getCardNo()>0)
            isCardNoAdded=true;
        else System.out.println("provide card no ");

        if(dto.getExpiryDate()!= null)
            isCardExpiryDateAdded=true;
        else System.out.println("provide expiry date");

        if(dto.getCvv()>0)
            isCardCvvNoAdded=true;
        else System.out.println("provide cvv number");

        if(dto.getCardProviderName()!=null)
            isCardProviderNameAdded=true;
        else System.out.println("provide provider name");

    }else System.out.println("invalid data......");

    if(isCardIdAdded==true && isCardHolderNameAdded==true && isCardNoAdded==true && isCardExpiryDateAdded==true && isCardCvvNoAdded==true && isCardProviderNameAdded==true){
        this.dto=dto;
        isCardInfoCreated=true;
    }
    return isCardInfoCreated;
    }

    public void getDetails(){
        System.out.println("card id is : " +dto.getCardId());
        System.out.println("card holder name is : "+dto.getCardHolderName());
        System.out.println("card no is : " +dto.getCardNo());
        System.out.println("expiry date is : " +dto.getExpiryDate());
        System.out.println("cvv number is : " +dto.getCvv());
        System.out.println("provider name is : " +dto.getCardProviderName());
    }
}
