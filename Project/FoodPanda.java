class FoodPanda{

 public static double getOrders(String grocery){
  
  if(grocery=="Fruits"){
   return 150.00;
  }
  if(grocery=="Sugar"){
   return 80.00;
  }
  if(grocery=="Basumathi Rice"){
   return 1000.00;
  }
  if(grocery=="Maida"){
   return 70.00;
  }
  if(grocery=="Meat"){
   return 150.00;
  }
  if(grocery=="Gram Flour"){
   return 80.00;
  }
  if(grocery=="Tea Powder"){
   return 50.00;
  }
  if(grocery=="Jagerry"){
   return 90.00;
  }
  if(grocery=="Coffee Powder"){
   return 110.00;
  }
  if(grocery=="Vegetable Oil"){
   return 180.00;
  }
  if(grocery=="Boost"){
   return 270.00;
  }
  if(grocery=="Peas"){
   return 100.00;
  }
  else{
    System.out.println(grocery+" Not Found");
	
  }
  return 0.0;
 
 }
 
 
  public static double getOrders(String grocery,int quantity){
  
  if(grocery=="Fruits"){
   return 150.00*quantity;
  }
  if(grocery=="Sugar"){
   return 80.00*quantity;
  }
  if(grocery=="Basumathi Rice"){
   return 1000.00*quantity;
  }
  if(grocery=="Maida"){
   return 70.00*quantity;
  }
  if(grocery=="Meat"){
   return 150.00*quantity;
  }
  if(grocery=="Gram Flour"){
   return 80.00*quantity;
  }
  if(grocery=="Tea Powder"){
   return 50.00*quantity;
  }
  if(grocery=="Jagerry"){
   return 90.00*quantity;
  }
  if(grocery=="Coffee Powder"){
   return 110.00*quantity;
  }
  if(grocery=="Vegetable Oil"){
   return 180.00*quantity;
  }
  if(grocery=="Boost"){
   return 270.00*quantity;
  }
  if(grocery=="Peas"){
   return 100.00*quantity;
  }
  else{
    System.out.println(grocery+" Not Found");
  }
  return 0.0;
 }

}