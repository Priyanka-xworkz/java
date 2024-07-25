package com.xworkz.agarbathi;

import com.xworkz.agarbathi.dao.AgarbathiDao;
import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiRunner {
    public static void main(String[] args) {
        AgarbathiDto dto = new AgarbathiDto();
        dto.id=1;
        dto.brandName="Cycle Pure Agarbathi";
        dto.noOfSticks=10;
        dto.fragrance="Gandha";
        dto.price=100.00;

        AgarbathiDao agarbathiDao = new AgarbathiDao();
        boolean ref = agarbathiDao.createAgarbathiDetails(dto);
        agarbathiDao.getAgarbathiDetails();
    }


}
