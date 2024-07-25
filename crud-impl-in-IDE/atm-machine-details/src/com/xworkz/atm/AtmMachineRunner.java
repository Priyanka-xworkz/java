package com.xworkz.atm;

import com.xworkz.atm.dao.AtmMachineDao;
import com.xworkz.atm.dto.AtmMachineDto;

public class AtmMachineRunner {
    public static void main(String[] args) {
        AtmMachineDto dto = new AtmMachineDto();

        dto.branch = "Rajajinagar";
        dto.bankName="HDFC";
        dto.typeOfAtm="Debit";
        dto.checkBalance=20000.00;

        AtmMachineDao atmMachineDao = new AtmMachineDao();
        boolean ref = atmMachineDao.createAtmMachineDetails(dto);
        atmMachineDao.getAtmMachineDetails();
    }

}
