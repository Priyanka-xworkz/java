class Zepto{

 public static double getOrder(String grocery){
  if(grocery=="Vegetables"){
    return 150.00;
  }
  if(grocery=="PopCoran"){
    return 200.00;
  }
  if(grocery=="Pasta"){
	return 50.00;
  }
  if(grocery=="Rava"){
	return 80.00;
  }
  if(grocery=="Dosa Rice"){
	return 90.00;  
  }
  if(grocery=="Basmati Rice"){
	return 250.00;
  }
  if(grocery=="Bread"){
	return 50.00;
  }
  if(grocery=="Fish Meat"){
	return 300.00;  
  }
  if(grocery=="Turmeric Powder"){
	return 50.00;  
  }
  if(grocery=="Peanut"){
	return 80.00;
  }
  if(grocery=="Poha"){
	return 60.00;
  }
  if(grocery=="Ragi"){
	return 100.00;
  }
  if(grocery=="Wheat"){
	return 100.00;
  }
  if(grocery=="Ragi Flour"){
	return 90.00;
  }
  if(grocery=="Wheat Flour"){
	return 150.00;
  }
  else{
    System.out.println(grocery+" is not found");
  }
  
  return 0.0; 
 }
 
 
 
 public static double getOrder(String grocery,int quantity){
  if(grocery=="Vegetables"){
    return 150.00*quantity;
  }
  if(grocery=="PopCoran"){
    return 200.00*quantity;
  }
  if(grocery=="Pasta"){
	return 50.00*quantity;
  }
  if(grocery=="Rava"){
	return 80.00*quantity;
  }
  if(grocery=="Dosa Rice"){
	return 90.00*quantity;  
  }
  if(grocery=="Basmati Rice"){
	return 250.00*quantity;
  }
  if(grocery=="Bread"){
	return 50.00*quantity;
  }
  if(grocery=="Fish Meat"){
	return 300.00*quantity;  
  }
  if(grocery=="Turmeric Powder"){
	return 50.00*quantity;  
  }
  if(grocery=="Peanut"){
	return 80.00*quantity;
  }
  if(grocery=="Poha"){
	return 60.00*quantity;
  }
  if(grocery=="Ragi"){
	return 100.00*quantity;
  }
  if(grocery=="Wheat"){
	return 100.00*quantity;
  }
  if(grocery=="Ragi Flour"){
	return 90.00*quantity;
  }
  if(grocery=="Wheat Flour"){
	return 150.00*quantity;
  }
  else{
    System.out.println(grocery+" is not found");
  }
  
  return 0.0; 
 }
}