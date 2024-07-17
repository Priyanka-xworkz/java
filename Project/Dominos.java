class Dominos{
	
	//method declaration
  public static double getOrder(String foodName){
    //is a basic so we write multiple if here but using database we can directly communicate with data and multiple if condition reduce 
   //why we write multiple return here
   //return is executed it got the value there then it doesnot look at the next code and execute the code in main  
   //why we need return statement in method:return statements are the last statement that will get executed in any method
  if(foodName=="FarmHouse Pizza"){
    return 150.00;
  }
  if(foodName=="Veg Pizza"){
    return 190.00;
  }
  if(foodName=="Chiken Dominator"){
	return 200.00;
  }
  if(foodName=="Cheese Bust Pizza"){
	return 250.00;
  }
  if(foodName=="Corn Pizza"){
	return 110.00;  
  }
  if(foodName=="Chiken Tikka Pizza"){
	return 300.00;
  }
  if(foodName=="Delux Veg Pizza"){
	return 250.00;
  }
  if(foodName=="Corn Cheese Pizza"){
	return 280.00;  
  }
  if(foodName=="Chicken Wings"){
	return 180.00;  
  }
  if(foodName=="Non Veg Pizza"){
	return 200.00;
  }
  if(foodName=="Mushroom Pizza"){
	return 190.00;
  }
  if(foodName=="Margherita Pizza"){
	return 250.00;
  }
  if(foodName=="Cheese Tomoto Pizza"){
	return 150.00;
  }
  if(foodName=="Paneer Pizza"){
	return 180.00;
  }
  if(foodName=="Cheese Paneer Pizza"){
	return 50.00;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  return 0.0;

  }
  
  //method overloading
    
  public static double getOrder(String foodName,long quntity){
	double price=0.0;
	if(foodName=="FarmHouse Pizza"){
    price=150.00*quntity;
	return price;
  }
  if(foodName=="Veg Pizza"){
    price=190.00*quntity;
	return price;
  }
  if(foodName=="Chiken Dominator"){
	price=200.00*quntity;
	return price;
  }
  if(foodName=="Cheese Bust Pizza"){
	price=250.00*quntity;
	return price;
  }
  if(foodName=="Corn Pizza"){
	price=110.00*quntity;
	return price;  
  }
  if(foodName=="Chiken Tikka Pizza"){
	price=300.00*quntity;
	return price;
  }
  if(foodName=="Delux Veg Pizza"){
	price=250.00*quntity;
	return price;
  }
  if(foodName=="Corn Cheese Pizza"){
	price=280.00*quntity;
	return price;  
  }
  if(foodName=="Chicken Wings"){
	price=180.00*quntity;
	return price;  
  }
  if(foodName=="Non Veg Pizza"){
	price=200.00*quntity;
	return price;
  }
  if(foodName=="Mushroom Pizza"){
	price=190.00*quntity;
	return price;
  }
  if(foodName=="Margherita Pizza"){
	price=250.00*quntity;
	return price;
  }
  if(foodName=="Cheese Tomoto Pizza"){
	price=150.00*quntity;
	return price;
  }
  if(foodName=="Paneer Pizza"){
	price=180.00*quntity;
	return price;
  }
  if(foodName=="Cheese Paneer Pizza"){
	price=50.00*quntity;
	return price;
  }
  else{
    System.out.println(foodName+" is not found");
  }
  
  return price;

  }

}