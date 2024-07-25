package com.xworkz.simcard;

import com.xworkz.simcard.dao.SimCardDao;
import com.xworkz.simcard.dto.SimCardDto;

public class SimCardRunner {
    public static void main(String[] args) {
        SimCardDto dto = new SimCardDto();

        dto.name = "Jio";
        dto.plan = "299 rs for 28 days ";
        dto.id = 1;


        SimCardDao simCardDao = new SimCardDao();
        boolean ref = simCardDao.createSimCardDetails(dto);
        simCardDao.getSimCardDetails();
    }
}
