class SportsFor{
	static String iplTeams[] = {"Royal Challengers Bengaluru", "Sunrise Hyderabad", "Lucknow Super Gaints", "Mumbai Indians", "Punjab Kings", "Rajasthan Royals", "Chennai Super Kings", "Delhi Capitals", "Gujarat Titans", "Kolkata Knight Riders"};
	static String batsMans[] = {"Sachin Tendulkar", "Rohit Sharma", "David Warner", "Dinesh Karthik", "virat kohli", "ABD", "Suresh Raina", "chris Gayle", "Maxwell", "Jadeja"};
	static String bowlers[] = {"Yuzvendra Chahal", "Piyush Chawla", "Dwayne Bravo", "Bhuvneshwar Kumar", "Sunil Narine", "Ravichandra Ashwin", "Amit Mishra", "Lasith Malinga", "Jasprit Bumrah", "Ravindra Jadeja"};
	static String iccTeams[] = {"India", "Ireland", "New Zealand", "Pakistan", "Afghanistan", "Australia", "Bangladesh", "england", "South Africa", "Sri Lanka"};

public static void main(String[] cricket){
	System.out.println("\nThe IPL teams are : "+iplTeams.length);
	for(int ipl = 0; ipl < iplTeams.length; ipl++){
	System.out.println(iplTeams[ipl]);
	}
	System.out.println("\nThe Bats man are: "+batsMans.length);
	for(int bat = 0; bat < batsMans.length; bat++){
	System.out.println(batsMans[bat]);
	}
	System.out.println("\nThe Bowlers are : "+bowlers.length);
	for(int Ball = 0; Ball < bowlers.length; Ball++ ){
		System.out.println(bowlers[Ball]);
	}
	System.out.println("\nThe ICC teams are : "+iccTeams.length);
	for(int icc = 0; icc < iccTeams.length; icc ++ ){
		System.out.println(iccTeams[icc]);
	}
	}

}