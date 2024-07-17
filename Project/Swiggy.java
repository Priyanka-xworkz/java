class Swiggy{
	//method declaration
  public static double getOrder(String foods){
  
  if(foods=="Pasta")
    return 180.00;
  
  if(foods=="Veg Burger")
    return 80.00;
  
  if(foods=="Mutton Biriyani")
	return 200.00;
  
  if(foods=="Veg fried Rice")
	return 150.00;
  
  if(foods=="Egg")
	return 10.00;  
  
  if(foods=="Hyderabad Veg Biriyani")
	return 300.00;
  
  if(foods=="Roti")
	return 50.00;
  
  if(foods=="Idli Vada")
	return 80.00;  
  
  if(foods=="Corn Fry")
	return 180.00;  
  
  if(foods=="Momos")
	return 90.00;
  
  if(foods=="Mysurpak")
	return 180.00;
  
  if(foods=="Leg Soup")
	return 190.00;
  
  if(foods=="Fish Curry")
	return 150.00;
  
  if(foods=="Fish Fry")
	return 150.00;
  
  if(foods=="Mutton Fry")
	return 160.00;
  
  else
    System.out.println(foods+" is not Available");
  
  
  return 0.0;
  
  }
  
  
  //method overloading
  public static double getOrder(String foods, int quantity){
	  double price = 0.0;
	  if(foods=="Pasta") {
		price=  180.00*quantity;	  
	  return price;
	  }
	  
	  if(foods=="Veg Burger") {
		price=  80.00*quantity;	  
	  return price;
	  }
	  return 0.0;
	  
  }
  
  
  
}

