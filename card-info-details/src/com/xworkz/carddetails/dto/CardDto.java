package com.xworkz.carddetails.dto;

public class CardDto {
    private int cardId;
    private String cardHolderName;
    private long cardNo;
    private String expiryDate;
    private int cvv;
    private  String cardProviderName;

    //getter


    public int getCardId() {
        return cardId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public long getCardNo() {
        return cardNo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardProviderName() {
        return cardProviderName;
    }

    public CardDto(int cardId, String cardHolderName, long cardNo, String expiryDate, int cvv, String cardProviderName){
        this.cardId=cardId;
        this.cardNo=cardNo;
        this.cardHolderName=cardHolderName;
        this.expiryDate=expiryDate;
        this.cvv=cvv;
        this.cardProviderName=cardProviderName;
    }
}
