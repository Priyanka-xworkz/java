package com.xworkz.carddetails;

import com.xworkz.carddetails.dao.CardDao;
import com.xworkz.carddetails.dto.CardDto;

public class CardRunner {
    public static void main(String[] args) {
        CardDto dto = new CardDto(12, "Priya", 123456789012l,"12/12/12", 123,"Harshi" );
        CardDao dao = new CardDao();
        boolean card = dao.createCardInfo(dto);
        System.out.println("all info is added " +card);
        dao.getDetails();
    }



}
