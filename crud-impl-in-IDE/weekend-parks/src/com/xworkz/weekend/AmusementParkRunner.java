package com.xworkz.weekend;

import com.xworkz.weekend.dao.AmusementParkDao;
import com.xworkz.weekend.dto.AmusementParkDto;

public class AmusementParkRunner {
    public static void main(String[] args) {
        AmusementParkDto dto = new AmusementParkDto();
        dto.id=1;
        dto.name="Wonderla";
        dto.place="Bengaluru";
        dto.noOfGames=20;

        AmusementParkDao amusementParkDao=new AmusementParkDao();
        boolean ref = amusementParkDao.createAmusementParkDetails(dto);
        amusementParkDao.getAmusementParkDetails();

    }
}
