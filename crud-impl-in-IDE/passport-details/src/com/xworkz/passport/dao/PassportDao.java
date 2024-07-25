package com.xworkz.passport.dao;
// fully qualified class name - package + class name
// import statement is used when we use a class which is in another folder
// standard package-- comp name and application name -- custome package
//dao dto are modules


import com.xworkz.passport.dto.PassportDto;

import java.sql.SQLOutput;

public class PassportDao {

    //non-primitive---dto
    // has a relationship , variables, instance //purpose of dao is to write logic to dto
    PassportDto dto;

     public boolean createPassportUserDetails(PassportDto dto) {
     boolean isDaoCreated = false;
         if (null != dto) {

             this.dto = dto;
             isDaoCreated=true;
         }else {
             System.out.println("Please Provide valid data");
         }
         return isDaoCreated;
         }

    public void getPassportUserDetails(){


        System.out.println("the cpv location is : "+ dto.cpvLocation);
        System.out.println("the DCDR location is : "+ dto.dcdrLocation);
        System.out.println("surename is  "+ dto.sureName);
        System.out.println("given name is "+ dto.givenName);
        System.out.println("date of birth is "+ dto.dob);
        System.out.println("email is "+ dto.email);
        System.out.println("is email login same "+ dto.isEmailLoginSame);
        System.out.println("login id "+ dto.loginId);
        System.out.println("pass word is "+ dto.pwd);
        System.out.println("confrim password is "+ dto.confirmPwd);
        System.out.println("hintQues "+dto.hintQues);
        System.out.println("hintAns is :" +dto.hintAns);
        System.out.println("capcha is " +dto.captcha);
    }

     }


