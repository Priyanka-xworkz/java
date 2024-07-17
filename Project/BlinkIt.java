class BlinkIt{

  public static double getOrder(String dailyNeeds){
  
   if(dailyNeeds=="Milk"){
    return 27.00;
   }
   if(dailyNeeds=="Fruits"){
    return 150.00; 
   }
   if(dailyNeeds=="Vegetables"){
    return 100.00;
   }
   if(dailyNeeds=="Cooking Oil"){
    return 150.00;
   }
   if(dailyNeeds=="Soap"){
    return 50.00;
   }
   if(dailyNeeds=="Shampoo"){
    return 180.00;
   }
   if(dailyNeeds=="Curry Leaves"){
    return 30.00;
   }
   if(dailyNeeds=="Paste"){
    return 40.00;
   }
   if(dailyNeeds=="Mouth Wash"){
    return 120.00;
   }
   if(dailyNeeds=="Body Lotion"){
    return 80.00;
   }
   if(dailyNeeds=="Perfume"){
    return 190.00;
   }
   if(dailyNeeds=="Face Cream"){
    return 240.00;
   }
   if(dailyNeeds=="Hair Oil"){
    return 120.00;
   }
   if(dailyNeeds=="Powder"){
    return 40.00;
   }
   if(dailyNeeds=="Curd"){
    return 40.00;
   }else{
    System.out.println(dailyNeeds+" Not Found");
   }
  return 0.0;
  }
  
   public static double getOrder(String dailyNeeds,int quantity){
  
   if(dailyNeeds=="Milk"){
    return 27.00*quantity;
   }
   if(dailyNeeds=="Fruits"){
    return 150.00*quantity; 
   }
   if(dailyNeeds=="Vegetables"){
    return 100.00*quantity;
   }
   if(dailyNeeds=="Cooking Oil"){
    return 150.00*quantity;
   }
   if(dailyNeeds=="Soap"){
    return 50.00*quantity;
   }
   if(dailyNeeds=="Shampoo"){
    return 180.00*quantity;
   }
   if(dailyNeeds=="Curry Leaves"){
    return 30.00*quantity;
   }
   if(dailyNeeds=="Paste"){
    return 40.00*quantity;
   }
   if(dailyNeeds=="Mouth Wash"){
    return 120.00*quantity;
   }
   if(dailyNeeds=="Body Lotion"){
    return 80.00*quantity;
   }
   if(dailyNeeds=="Perfume"){
    return 190.00*quantity;
   }
   if(dailyNeeds=="Face Cream"){
    return 240.00*quantity;
   }
   if(dailyNeeds=="Hair Oil"){
    return 120.00*quantity;
   }
   if(dailyNeeds=="Powder"){
    return 40.00*quantity;
   }
   if(dailyNeeds=="Curd"){
    return 40.00*quantity;
   }else{
    System.out.println(dailyNeeds+" Not Found");
   }
  return 0.0;
  }
}