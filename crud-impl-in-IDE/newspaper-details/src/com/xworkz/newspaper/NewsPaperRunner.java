package com.xworkz.newspaper;

import com.xworkz.newspaper.dao.NewsPaperDao;
import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperRunner {
    public static void main(String[] args) {
        NewsPaperDto dto = new NewsPaperDto();
        dto.companyName = "Ananda Bazar Patrika";
        dto.id=1;
        dto.noOfPages=5;
        dto.language = "Bengali";
        dto.price = 10;

        NewsPaperDao newsPaperDao = new NewsPaperDao();
        boolean ref = newsPaperDao.createNewsPaperDetails(dto);
        newsPaperDao.getNewsPaperDetails();
    }
}
