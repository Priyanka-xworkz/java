class Sports{
	static String iplTeams[] = {"Royal Challengers Bengaluru", "Sunrise Hyderabad", "Lucknow Super Gaints", "Mumbai Indians", "Punjab Kings", "Rajasthan Royals", "Chennai Super Kings", "Delhi Capitals", "Gujarat Titans", "Kolkata Knight Riders"};
	static String batsMans[] = {"Sachin Tendulkar", "Rohit Sharma", "David Warner", "Dinesh Karthik", "virat kohli", "ABD", "Suresh Raina", "chris Gayle", "Maxwell", "Jadeja"};
	static String bowlers[] = {"Yuzvendra Chahal", "Piyush Chawla", "Dwayne Bravo", "Bhuvneshwar Kumar", "Sunil Narine", "Ravichandra Ashwin", "Amit Mishra", "Lasith Malinga", "Jasprit Bumrah", "Ravindra Jadeja"};
	static String iccTeams[] = {"India", "Ireland", "New Zealand", "Pakistan", "Afghanistan", "Australia", "Bangladesh", "england", "South Africa", "Sri Lanka"};

public static void main(String[] cricket){
	System.out.println("\n The IPL teams are:");
	for(int index = 0; index < iplTeams.length; index ++ ){
		System.out.println(iplTeams[index]);
	}
	System.out.println("\n The Bats man are: ");
	for(int index = 0; index < batsMans.length; index ++ ){
		System.out.println(batsMans[index]);
	}
	System.out.println("\n The Bowlers are : ");
	for(int index = 0; index < bowlers.length; index ++ ){
		System.out.println(bowlers[index]);
	}
	System.out.println("\n The ICC teams are : ");
	for(int index = 0; index < iccTeams.length; index ++ ){
		System.out.println(iccTeams[index]);
	}
	}

}