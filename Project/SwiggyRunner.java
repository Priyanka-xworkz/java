class SwiggyRunner{

  public static void main(String[] getOrder){
  
  System.out.println("main Started");
   
   double price=Swiggy.getOrder("Pasta");
   System.out.println("Price for Pasta "+price);
   
   double price1=Swiggy.getOrder("Veg Burger");
   System.out.println("Price for Veg Burger "+price1);
   
   double price2=Swiggy.getOrder("Mutton Biriyani");
   System.out.println("Price for Mutton Biriyani "+price2);
   
   double price3=Swiggy.getOrder("Veg fried Rice");
   System.out.println("Price for Veg fried Rice "+price3);
   
   double price4=Swiggy.getOrder("Egg");
   System.out.println("Price for Egg "+price4);
   
   double price5=Swiggy.getOrder("Hyderabad Veg Biriyani");
   System.out.println("Price for Hyderabad Veg Biriyani "+price5);
   
   double price6=Swiggy.getOrder("Roti");
   System.out.println("Price for Roti "+price6);
   
   double price7=Swiggy.getOrder("Idli Vada");
   System.out.println("Price for Idli Vada "+price7);
   
   double price8=Swiggy.getOrder("Corn Fry");
   System.out.println("Price for Corn Fry "+price8);
   
   double price9=Swiggy.getOrder("Momos");
   System.out.println("Price for Momos "+price9);
   
   double price10=Swiggy.getOrder("Mysurpak");
   System.out.println("Price for Mysurpak "+price10);
   
   double price11=Swiggy.getOrder("Leg Soup");
   System.out.println("Price for Leg Soup "+price11);
   
   double price12=Swiggy.getOrder("Fish Curry");
   System.out.println("Price for Fish Curry "+price12);
   
   double price13=Swiggy.getOrder("Fish Fry");
   System.out.println("Price for Fish Fry "+price13);
   
   double price14=Swiggy.getOrder("Mutton Fry");
   System.out.println("Price for Mutton Fry "+price14);
    
   double price15=Swiggy.getOrder("Pizza");
   System.out.println("price for Pizza "+price15);
   
   double price16=Swiggy.getOrder("Pasta" , 4);
   System.out.println("Price for  4 Pasta "+price16);
   
   double price17=Swiggy.getOrder("Veg Burger", 4);
   System.out.println("Price for  4 Veg Burger "+price17);
   
   
   System.out.println("main ended");
 
  
  }
}