class FiveStarChicken{

  public static double getOrder(String chickenFood){
  
  
  if(chickenFood=="Chicken Biriyani"){
    return 150.00;
  }
  if(chickenFood=="Donne Chicken Biriyani"){
    return 200.00;
  }
  if(chickenFood=="Chicken Kabab"){
	return 200.00;
  }
  if(chickenFood=="Chicken Fry"){
	return 150.00;
  }
  if(chickenFood=="Chicken Pepper Fry"){
	return 130.00;  
  }
  if(chickenFood=="Chicken Lolypop"){
	return 240.00;
  }
  if(chickenFood=="Guntoor Chicken"){
	return 230.00;
  }
  if(chickenFood=="Lemon Chicken"){
	return 100.00;  
  }
  if(chickenFood=="Chicken Choopes"){
	return 280.00;  
  }
  if(chickenFood=="Chicken Kurma"){
	return 230.00;
  }
  if(chickenFood=="Chicken Masala"){
	return 140.00;
  }
  if(chickenFood=="Chicken Kolapuri"){
	return 190.00;
  }
  if(chickenFood=="Chicken Kadai"){
	return 150.00;
  }
  if(chickenFood=="Chicken Kadai Masala"){
	return 180.00;
  }
  if(chickenFood=="Chicken Fried Rice"){
	return 250.00;
  }
  else{
    System.out.println(chickenFood+" is not available");
  }
  
  return 0.00;
   
  }

}