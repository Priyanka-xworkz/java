class FiveStarChiken{

  public static double getOrder(String foodName){
  
  System.out.println("getOrder Started");
  
  if(foodName=="Chiken Biriyani"){
    return 150.00;
  }
  if(foodName=="Donne Chiken Biriyani"){
    return 200.00;
  }
  if(foodName=="Chiken Kabab"){
	return 200.00;
  }
  if(foodName=="Chiken Fry"){
	return 150.00;
  }
  if(foodName=="Chiken Pepper Fry"){
	return 130.00;  
  }
  if(foodName=="Chiken Lolypop"){
	return 240.00;
  }
  if(foodName=="Guntoor Chiken"){
	return 230.00;
  }
  if(foodName=="Lemon Chiken"){
	return 100.00;  
  }
  if(foodName=="Chiken Choopes"){
	return 280.00;  
  }
  if(foodName=="Chiken Kurma"){
	return 230.00;
  }
  if(foodName=="Chiken Masala"){
	return 140.00;
  }
  if(foodName=="Chiken Kolapuri"){
	return 190.00;
  }
  if(foodName=="Chiken Kadai"){
	return 150.00;
  }
  if(foodName=="Chiken Kadai Masala"){
	return 180.00;
  }
  if(foodName=="Chiken Fried Rice"){
	return 250.00;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  System.out.println("getOrder ended");
  return 0.0;
   
  }
  
  //other method
  public static double getOrder(String foodName,int quantity){
  
  System.out.println("getOrder Started");
  
  if(foodName=="Chiken Biriyani"){
    return 150.00*quantity;
  }
  if(foodName=="Donne Chiken Biriyani"){
    return 200.00*quantity;
  }
  if(foodName=="Chiken Kabab"){
	return 200.00*quantity;
  }
  if(foodName=="Chiken Fry"){
	return 150.00*quantity;
  }
  if(foodName=="Chiken Pepper Fry"){
	return 130.00*quantity;  
  }
  if(foodName=="Chiken Lolypop"){
	return 240.00*quantity;
  }
  if(foodName=="Guntoor Chiken"){
	return 230.00*quantity;
  }
  if(foodName=="Lemon Chiken"){
	return 100.00*quantity;  
  }
  if(foodName=="Chiken Choopes"){
	return 280.00*quantity;  
  }
  if(foodName=="Chiken Kurma"){
	return 230.00*quantity;
  }
  if(foodName=="Chiken Masala"){
	return 140.00*quantity;
  }
  if(foodName=="Chiken Kolapuri"){
	return 190.00*quantity;
  }
  if(foodName=="Chiken Kadai"){
	return 150.00*quantity;
  }
  if(foodName=="Chiken Kadai Masala"){
	return 180.00*quantity;
  }
  if(foodName=="Chiken Fried Rice"){
	return 250.00*quantity;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  System.out.println("getOrder ended");
  return 0.0;
   
  }

}