package com.xworkz.atm.dao;

import com.xworkz.atm.dto.AtmMachineDto;

public class AtmMachineDao {
    AtmMachineDto dto;
    public boolean createAtmMachineDetails(AtmMachineDto dto){
        boolean isDaoCreated = false;
        if(null != dto){
            this.dto=dto;
            isDaoCreated = true;
        }else {
            System.out.println("Please Provide valid details");
        }
        return isDaoCreated;

    }
    public void getAtmMachineDetails(){
        System.out.println("branch : " +dto.branch);
        System.out.println("bankName : " +dto.bankName);
        System.out.println("typeOfAtm : " +dto.typeOfAtm);
        System.out.println("checkBalance : " +dto.checkBalance);
    }
}
