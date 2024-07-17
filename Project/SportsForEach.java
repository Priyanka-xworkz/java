class SportsForEach{
	static String iplTeams[] = {"Royal Challengers Bengaluru", "Sunrise Hyderabad", "Lucknow Super Gaints", "Mumbai Indians", "Punjab Kings", "Rajasthan Royals", "Chennai Super Kings", "Delhi Capitals", "Gujarat Titans", "Kolkata Knight Riders"};
	static String batsMans[] = {"Sachin Tendulkar", "Rohit Sharma", "David Warner", "Dinesh Karthik", "virat kohli", "ABD", "Suresh Raina", "chris Gayle", "Maxwell", "Jadeja"};
	static String bowlers[] = {"Yuzvendra Chahal", "Piyush Chawla", "Dwayne Bravo", "Bhuvneshwar Kumar", "Sunil Narine", "Ravichandra Ashwin", "Amit Mishra", "Lasith Malinga", "Jasprit Bumrah", "Ravindra Jadeja"};
	static String iccTeams[] = {"India", "Ireland", "New Zealand", "Pakistan", "Afghanistan", "Australia", "Bangladesh", "england", "South Africa", "Sri Lanka"};

public static void main(String[] cricket){
	System.out.println("\nThe IPL teams are : "+iplTeams.length);
	for(String iplTeam : iplTeams){
	System.out.println(iplTeam);
	}
	System.out.println("\nThe Bats man are : "+batsMans.length);
	for(String batsMan : batsMans){
	System.out.println(batsMan);
	}
	System.out.println("\nThe Bowlers are : "+bowlers.length);
	for(String bowler : bowlers){
		System.out.println(bowler);
	}
	System.out.println("\nThe ICC teams are : "+iccTeams.length );
	for(String iccTeam : iccTeams){
		System.out.println(iccTeam);
	}
	}

}