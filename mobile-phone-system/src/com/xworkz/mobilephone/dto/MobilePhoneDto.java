package com.xworkz.mobilephone.dto;

public class MobilePhoneDto {
    private int refId;
    private long contactNo;
    private String contactName;
    //getter
    public int getRefId() {
        return refId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public String getContactName() {
        return contactName;
    }

    public MobilePhoneDto(int refId , long contactNo, String contactName){
        this.refId=refId;
        this.contactNo=contactNo;
        this.contactName=contactName;
    }


}
