package com.xworkz.mobilephone;

import com.xworkz.mobilephone.dao.MobilePhoneDao;
import com.xworkz.mobilephone.dto.MobilePhoneDto;

public class MobilePhoneRunner {
    public static void main(String[] args) {

        MobilePhoneDto dto = new MobilePhoneDto(12, 9113629668l, "Priyanka");
        MobilePhoneDao dao= new MobilePhoneDao();
        boolean phone = dao.createMobileInfo(dto);
        System.out.println("all info is added " +phone);
        dao.getDetails();
    }
}
