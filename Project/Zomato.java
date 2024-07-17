class Zomato{

 public static double getOrder(String foodName){
  if(foodName=="Pizza"){
    return 99.00;
  }
  if(foodName=="Burger"){
    return 88.00;
  }
  if(foodName=="Frenchfries"){
	return 50.00;
  }
  if(foodName=="Biriyani"){
	return 180.00;
  }
  if(foodName=="Shawarma"){
	return 200.00;  
  }
  if(foodName=="Hyderabad Biriyani"){
	return 300.00;
  }
  if(foodName=="Chicken Cuury"){
	return 250.00;
  }
  if(foodName=="Oottupura"){
	return 200.00;  
  }
  if(foodName=="Spice Tandoori"){
	return 280.00;  
  }
  if(foodName=="Kabab"){
	return 250.00;
  }
  if(foodName=="Sichuan"){
	return 100.00;
  }
  if(foodName=="Veg Biriyani"){
	return 290.00;
  }
  if(foodName=="Fish Fry"){
	return 100.00;
  }
  if(foodName=="Gril Biriyani"){
	return 200.00;
  }
  if(foodName=="Mughlai Paratha"){
	return 150.00;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  return 0.0;
 }



 public static double getOrder(String foodName,int quantity){
  if(foodName=="Pizza"){
    return 99.00*quantity;
  }
  if(foodName=="Burger"){
    return 88.00*quantity;
  }
  if(foodName=="Frenchfries"){
	return 50.00*quantity;
  }
  if(foodName=="Biriyani"){
	return 180.00*quantity;
  }
  if(foodName=="Shawarma"){
	return 200.00*quantity;  
  }
  if(foodName=="Hyderabad Biriyani"){
	return 300.00*quantity;
  }
  if(foodName=="Chicken Cuury"){
	return 250.00*quantity;
  }
  if(foodName=="Oottupura"){
	return 200.00*quantity;  
  }
  if(foodName=="Spice Tandoori"){
	return 280.00*quantity;  
  }
  if(foodName=="Kabab"){
	return 250.00*quantity;
  }
  if(foodName=="Sichuan"){
	return 100.00*quantity;
  }
  if(foodName=="Veg Biriyani"){
	return 290.00*quantity;
  }
  if(foodName=="Fish Fry"){
	return 100.00*quantity;
  }
  if(foodName=="Gril Biriyani"){
	return 200.00*quantity;
  }
  if(foodName=="Mughlai Paratha"){
	return 150.00*quantity;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  return 0.0;
 } 

}