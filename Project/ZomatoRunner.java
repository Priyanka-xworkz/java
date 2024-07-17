class ZomatoRunner{

  public static void main(String[] foodName){
   
   System.out.println("main Started");
   
   double price=Zomato.getOrder("Pizza");
   System.out.println("Price for Pizza "+price);
   
   double price1=Zomato.getOrder("Burger");
   System.out.println("Price for Burger "+price1);
   
   double price2=Zomato.getOrder("Frenchfries");
   System.out.println("Price for Frenchfries "+price2);
   
   double price3=Zomato.getOrder("Biriyani");
   System.out.println("Price for Biriyani "+price3);
   
   double price4=Zomato.getOrder("Shawarma");
   System.out.println("Price for Shawarma "+price4);
   
   double price5=Zomato.getOrder("Hyderabad Biriyani");
   System.out.println("Price for Hyderabad Biriyani "+price5);
   
   double price6=Zomato.getOrder("Chicken Cuury");
   System.out.println("Price for Chicken Cuury "+price6);
   
   double price7=Zomato.getOrder("Oottupura");
   System.out.println("Price for Oottupura "+price7);
   
   double price8=Zomato.getOrder("Spice Tandoori");
   System.out.println("Price for Spice Tandoori "+price8);
   
   double price9=Zomato.getOrder("Kabab");
   System.out.println("Price for Kabab "+price9);
   
   double price10=Zomato.getOrder("Sichuan");
   System.out.println("Price for Sichuan "+price10);
   
   double price11=Zomato.getOrder("Veg Biriyani");
   System.out.println("Price for Veg Biriyani "+price11);
   
   double price12=Zomato.getOrder("Fish Fry");
   System.out.println("Price for Fish Fry "+price12);
   
   double price13=Zomato.getOrder("Gril Biriyani");
   System.out.println("Price for Gril Biriyani "+price13);
   
   double price14=Zomato.getOrder("Mughlai Paratha");
   System.out.println("Price for Mughlai Paratha "+price14);
    
   double price15=Zomato.getOrder("Pani Puri");
   System.out.println("price for Pani Puri "+price15);
   
   
   
   
   double price16=Zomato.getOrder("Pizza",5);
   System.out.println("Price for Pizza "+price16);
   
   double price17=Zomato.getOrder("Burger",3);
   System.out.println("Price for Burger "+price17);
   
   double price18=Zomato.getOrder("Frenchfries",2);
   System.out.println("Price for Frenchfries "+price18);
   
   double price19=Zomato.getOrder("Biriyani",5);
   System.out.println("Price for Biriyani "+price19);
   
   double price20=Zomato.getOrder("Shawarma",4);
   System.out.println("Price for Shawarma "+price20);
   
   double price21=Zomato.getOrder("Hyderabad Biriyani",6);
   System.out.println("Price for Hyderabad Biriyani "+price21);
   
   double price22=Zomato.getOrder("Chicken Cuury",3);
   System.out.println("Price for Chicken Cuury "+price22);
   
   double price23=Zomato.getOrder("Oottupura",2);
   System.out.println("Price for Oottupura "+price23);
   
   double price24=Zomato.getOrder("Spice Tandoori",6);
   System.out.println("Price for Spice Tandoori "+price24);
   
   double price25=Zomato.getOrder("Kabab",2);
   System.out.println("Price for Kabab "+price25);
   
   double price26=Zomato.getOrder("Sichuan",3);
   System.out.println("Price for Sichuan "+price26);
   
   double price27=Zomato.getOrder("Veg Biriyani",2);
   System.out.println("Price for Veg Biriyani "+price27);
   
   double price28=Zomato.getOrder("Fish Fry",5);
   System.out.println("Price for Fish Fry "+price28);
   
   double price29=Zomato.getOrder("Gril Biriyani",2);
   System.out.println("Price for Gril Biriyani "+price29);
   
   double price30=Zomato.getOrder("Mughlai Paratha",5);
   System.out.println("Price for Mughlai Paratha "+price30);
    
   double price31=Zomato.getOrder("Pani Puri",3);
   System.out.println("price for Pani Puri "+price31);
   
   System.out.println("main ended");
  }

}