class NetflixFor{
	static String englishMovies[] = {"The Godfather", "The Shawshank Redemption", "The Godfather part 2", "Inception", "The Painist", "Titanic", "Shutter Island", "The Notebook", "Schindler's List", "Braveheart", "Kingdom of heaven", "300", "Troy", "Twilight", "The Reader", "Gladiator", "The lord of thr Rings", "The Dark knight", "pirates of the Caribbean", "Argo", "gran torino", "Eternal Sunshine of the Spotless Mind", "A Clockwork Orange", "limitless"};
	static String kannadaMovies[] = {"Chandramukhi", "Kanasemba Kudureyaneri", "Sanju Weds geetha", "Kranthiveera Sangolli Rayanna", "Govindaaya Namaha", "Lucia", "6-5=2", "BharathStores", "Ugramm", "Ulidavaru kandanthe", "RangiTaranga", "KendaSampige", "Kiraggorina Gayyaligalu", "Godhi Banna Sadharana Mykattu", "Kirik Party", "Shuddhi", "Thithi", "Story of an Egg", "K.G.F", "Tagaru", "Nathicharami", "Humble Politian Nograj", "kattera", "Bell Bottom", "kavaludarri"};
	static String hindiMovies[] = {"Guzaarish", "The Japanese Wife", "Baghban", "Kabhi Kushi Kabhie Gham", "Drishyam", "Dharm", "Thrist", "Raincoat", "Devdas", "Kaksparsh", "Baahubali", "Jodhaa Akbar", "Mughal-E-Azam", "OMG", "rann", "Cabin Crew", "Dabangg", "3 Idiots", "Toilet", "Kesari", "Pad Man", "Cycle", "Gulabjaam", "Bodyguard"};
	static String koreanSeries[] = {"It's Okay, That's Love", "Moon Lovers", "The Lover", "Oh My Ghost", "Cheese in the trap", "Another Miss Oh", "Uncontrollably Fond", "Move to Heaven", "Reply 1997", "The Emperor", "School 2015", "Weightlifting Fairy Kim bok-joo", "Missing 9", "Age of Youth", "Come and hug Me", "Fight for My Way", "Don't Dare to Dream", "Because this is my first life", "Sky castle", "20th century boy and girl", "her private life", "i'm not a robot", "save me", "the queen's umbreella", "grand prince"};
public static void main(String[] movies){
	System.out.println("The English Movies are:"+englishMovies.length);
	for(int engmov=0; engmov < englishMovies.length; engmov++){
		System.out.println(englishMovies[engmov]);	
	}
	System.out.println("\nThe kannada Movies are: "+kannadaMovies.length);
	for(int kanmov=0; kanmov < kannadaMovies.length; kanmov++){
		System.out.println(kannadaMovies[kanmov]);
	}	
	System.out.println("\nThe Hindi Movies are:"+hindiMovies.length);
	for(int hindimov=0; hindimov < hindiMovies.length; hindimov++){
		System.out.println(hindiMovies[hindimov]);
	}
	System.out.println("\nThe Korean Series are: "+koreanSeries.length);
	for(int korea=0; korea < koreanSeries.length; korea++){
		System.out.println(koreanSeries[korea]);
	}
}
}
