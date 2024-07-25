package com.xworkz.resort;

import com.xworkz.resort.dao.ResortDao;
import com.xworkz.resort.dto.ResortDto;

public class ResortRunner {
    public static void main(String[] args) {
        ResortDto dto = new ResortDto();
        dto.areaInSqrt = "200-acre";
        dto.propertyName = "machaan plantation resort";
        dto.ownerName = "Pallavi";
        dto.noOfRooms = 50;
        dto.id = 1;
        ResortDao resortDao = new ResortDao();
        boolean ref = resortDao.createResortDetails(dto);
        resortDao.getResortDetails();
    }

}
