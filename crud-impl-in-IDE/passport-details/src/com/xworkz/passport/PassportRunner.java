package com.xworkz.passport;

import com.xworkz.passport.dao.PassportDao;
import com.xworkz.passport.dto.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        System.out.println("main started");


        PassportDto dto = new PassportDto();
        dto.cpvLocation = "PO";
        dto.dcdrLocation = 8;
        dto.sureName = "Priyanka";
        dto.givenName = "ND";
        dto.dob = "27/03/2003";
        dto.email = "priyanka08134@gmail.com";
        dto.isEmailLoginSame = true;
        dto.loginId = "priyanka08134@gmail.com";
        dto.pwd = "Priya@1122";
        dto.confirmPwd="Priya@1122";
        dto.hintQues = "color";
        dto.hintAns = "blue";
        dto.captcha = "AWE2233R";



        PassportDao passportDao = new PassportDao();
        boolean ref = passportDao.createPassportUserDetails(dto);
        passportDao.getPassportUserDetails();

        System.out.println("main ended");
    }
}
