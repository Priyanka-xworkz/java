package com.xworkz.shampoo;

import com.xworkz.shampoo.dao.ShampooDao;
import com.xworkz.shampoo.dto.ShampooDto;

public class ShampooRunner {

    public static void main(String[] args) {
        ShampooDto dto = new ShampooDto();

        dto.brandName = "Head and shoulders";
        dto.qty = 110;
        dto.type = "dandruff";
        dto.prize = 200.00;
        dto.mgfDate="20/12/2021";
        dto.expDate = " 15/11/2025";

        ShampooDao shampooDao = new ShampooDao();
        boolean ref = shampooDao.createShampooDetails(dto);
        shampooDao.getShampooDetails();

    }

}
