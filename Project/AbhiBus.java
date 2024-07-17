class AbhiBus{
	static String busNames[] = {"Sea Bird", "vrl", "srs", "praveen", "rajahamsa"};
	//methods
	public static void getBusNames(){
		for(String busName : busNames){
	System.out.println(busName);
	}
	}
	public static void main(String[] bus){
	System.out.println("the buses available to transport are : ");
	getBusNames();
	
	}


}