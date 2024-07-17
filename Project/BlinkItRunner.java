class BlinkItRunner{
  public static void main(String[] dailyNeeds){
  
   System.out.println("main Started");
   
   double price=BlinkIt.getOrder("Milk");
   System.out.println("Price for Milk "+price);
   
   double price1=BlinkIt.getOrder("Fruits");
   System.out.println("Price for Fruits "+price1);
   
   double price2=BlinkIt.getOrder("Vegetables");
   System.out.println("Price for Vegetables "+price2);
   
   double price3=BlinkIt.getOrder("Cooking Oil");
   System.out.println("Price for Cooking Oil "+price3);
   
   double price4=BlinkIt.getOrder("Soap");
   System.out.println("Price for Soap "+price4);
   
   double price5=BlinkIt.getOrder("Shampoo");
   System.out.println("Price for Shampoo "+price5);
   
   double price6=BlinkIt.getOrder("Curry Leaves");
   System.out.println("Price for Curry Leaves "+price6);
   
   double price7=BlinkIt.getOrder("Paste");
   System.out.println("Price for Paste "+price7);
   
   double price8=BlinkIt.getOrder("Mouth Wash");
   System.out.println("Price for Mouth Wash "+price8);
   
   double price9=BlinkIt.getOrder("Body Lotion");
   System.out.println("Price for Body Lotion "+price9);
   
   double price10=BlinkIt.getOrder("Perfume");
   System.out.println("Price for Perfume "+price10);
   
   double price11=BlinkIt.getOrder("Face Cream");
   System.out.println("Price for Face Cream "+price11);
   
   double price12=BlinkIt.getOrder("Hair Oil");
   System.out.println("Price for Hair Oil "+price12);
   
   double price13=BlinkIt.getOrder("Powder");
   System.out.println("Price for Powder "+price13);
   
   double price14=BlinkIt.getOrder("Curd");
   System.out.println("Price for Curd "+price14);
    
   double price15=BlinkIt.getOrder("Maggi");
   System.out.println("price for Maggi "+price15);
  
  //invoking other method
  //Method Overloading
   
   
   double price16=BlinkIt.getOrder("Milk",3);
   System.out.println("Price for Milk "+price16);
   
   double price17=BlinkIt.getOrder("Fruits",2);
   System.out.println("Price for Fruits "+price17);
   
   double price18=BlinkIt.getOrder("Vegetables",3);
   System.out.println("Price for Vegetables "+price18);
   
   double price19=BlinkIt.getOrder("Cooking Oil",4);
   System.out.println("Price for Cooking Oil "+price19);
   
   double price20=BlinkIt.getOrder("Soap",3);
   System.out.println("Price for Soap "+price20);
   
   double price21=BlinkIt.getOrder("Shampoo",2);
   System.out.println("Price for Shampoo "+price21);
   
   double price22=BlinkIt.getOrder("Curry Leaves",4);
   System.out.println("Price for Curry Leaves "+price22);
   
   double price23=BlinkIt.getOrder("Paste",3);
   System.out.println("Price for Paste "+price23);
   
   double price24=BlinkIt.getOrder("Mouth Wash",24);
   System.out.println("Price for Mouth Wash "+price24);
   
   double price25=BlinkIt.getOrder("Body Lotion",3);
   System.out.println("Price for Body Lotion "+price25);
   
   double price26=BlinkIt.getOrder("Perfume",3);
   System.out.println("Price for Perfume "+price26);
   
   double price27=BlinkIt.getOrder("Face Cream",2);
   System.out.println("Price for Face Cream "+price27);
   
   double price28=BlinkIt.getOrder("Hair Oil",3);
   System.out.println("Price for Hair Oil "+price28);
   
   double price29=BlinkIt.getOrder("Powder",4);
   System.out.println("Price for Powder "+price29);
   
   double price30=BlinkIt.getOrder("Curd",5);
   System.out.println("Price for Curd "+price30);
    
   double price31=BlinkIt.getOrder("Maggi",5);
   System.out.println("price for Maggi "+price31);
   
   System.out.println("main ended");
  
  }
}