class DmartForEach{
	static String chocolates[] = {"Kit Kat", "Dairy Milk", "Snickers", "Milky Bar", "Eclairs","Safari","Temptation","Silk", "5Star", "cadbury", "Amul","parle","lotus", "ferrero", "campco"};
	static String perfumes[] = {"eva","fogg","belavita","park avenue","yardley", "Chanel" ,"calvin Kelin", "guerlain", "Dior", "Gucci", "denver", "imapct", "nivea", "villain", "engage"};
	static String groceries[] = {"Rice", "Atta", "Dal", "coffee", "Tea", "Sugar", "spices", "pasta", "noodles", "snaks", "Milk", "Sauces", "masala", "oil", "frozen food"};
	static String shampoos[] = {"loreal", "tresemme", "khadi", "kesh king", "dabur", "mamaearth", "biotique", "indulekha", "chik", "clinic", "nyle", "all clear", " Himalayan", "anti-dandruf", "loreal"};
	static String conditioners[] = {"loreal", "tresemme", "khadi", "kesh king", "dabur", "mamaearth", "biotique", "indulekha", "chik", "clinic", "nyle", "all clear", " Himalayan", "anti-dandruf", "loreal"};
	static String soaps[] = {"dove", "lifeboy", "chandrika", "lux", "savlon", "vita", "santoor", "mysore sandal", "himalayan", "dettol", "wipro", "godrej", "vivel", "akash", "dermedon"};
	static String toothPastes[] = {"Colgate", "dabur", "crest", "aquafresh", "patanjali", "darlie", "dantha kanti", "paradontax", "sensoden", "miswak", "closeup", "sparkle", "signal", "vicco", "bambool"};
	static String mouthWashs[] = {"Colgate", "dabur", "crest", "aquafresh", "patanjali", "darlie", "dantha kanti", "paradontax", "sensoden", "miswak", "closeup", "sparkle", "signal", "vicco", "bambool"};
	static String shavingCreams[] = {"gillete", "himalaya", "vivel", "indulekha", "lakme", "lux", "nivea", "innisfree", "dettol", "forest", "natio", "bombay", "park avenue", "wild stone", "yardley"};
	static String moisturisers[] = {"pilgrim", "minimalist", "nivea", "ponds", "cetphil", "biotique","dotkey", "sebamed", "neutrogen", "neutriderma", "lakme", "himalaya", "cerave", "wow", "lacto"};
	static String handLotions[] = {"curel", "vaseline", "eucerin", "beauty", "neutrogena", "karite", "loccitane", "mary kay", "aveeno", "fresh milk", "colorbar", "deep radiance", "choco", "plum", "aroma"};
	static String bodyLotions[] = {"dove", "lifeboy", "chandrika", "lux", "savlon", "vita", "santoor", "mysore sandal", "himalayan", "dettol", "wipro", "godrej", "vivel", "akash", "dermedon"};
	static String spices[] = {"cumin", "bay leaves", "allspice", "fennel", "ginger", "chili powder", "curry leaves", "mustard seed", "saffron", "mustrad", "ajwain", "paprika", "clove", "cinnamon", "black pepper"};
	static String dals[] = {"mossor dal", "chana daal", "panchmel dal", "moth bean", "black urad dal", "black chickpea", "dal tadka", "lentils", "mung dal", "gujarati dal", "dal fry", "horse gram", "pea", "chickpea", "soybean"};
	static String rices[] = {"Ambemohar", "bamboo", "basmati", "dubraj", "gobindobhag", "HMT kolam", "indrayani", "jeera samba", "mappillai samba", "mogra", "molakolukulu", "matta", "parmal", "ponni", "sharbati"};
	
public static void main(String[] newCollection){
	System.out.println("\nThe Available Chocolates are: "+chocolates.length);
	for(String chocolate : chocolates){
		System.out.println(chocolate);
	}
	System.out.println("\n The perfumes available are : "+perfumes.length);
	for(String perfume : perfumes){
		System.out.println(perfume);
	}
	System.out.println("\n The Available groceries are : "+groceries.length); 
	for(String grocerie : groceries){
		System.out.println(grocerie);
	}
	System.out.println("\n The Available shampoos are : "+shampoos.length);
	for(String shampoo : shampoos){
		System.out.println(shampoo);
	}
	System.out.println("\n The Available conditioners are: "+conditioners.length);
	for(String conditioner : conditioners){
		System.out.println(conditioner);
	}
	System.out.println("\n The Available soaps are: "+soaps.length);
	for(String soap : soaps){
		System.out.println(soap);
	}
	System.out.println("\n The Available Tooth paste are: "+toothPastes.length);
	for(String toothPaste : toothPastes){
		System.out.println(toothPaste);
	}
	System.out.println("\n The Available Mouth Washers are: "+mouthWashs.length);
	for(String mouthWash : mouthWashs){
		System.out.println(mouthWash);
	}
	System.out.println("\n The Available Shaving Creams are: "+shavingCreams.length);
	for(String shavingCream : shavingCreams){
		System.out.println(shavingCream);
	}
	System.out.println("\n The Available Moisturisers are: "+moisturisers.length);
	for(String moisturiser : moisturisers){
		System.out.println(moisturiser);
	}
	System.out.println("\n The Available Hand Lotions are: "+handLotions.length);
	for(String handLotion : handLotions){
		System.out.println(handLotion);
	}
	System.out.println("\n The Available Body Lotions are: "+bodyLotions.length);
	for(String bodyLotion : bodyLotions){
		System.out.println(bodyLotion);
	}
	System.out.println("\n The Available Spices are: "+spices.length);
	for(String spice : spices){
		System.out.println(spice);
	}
	System.out.println("\n -The Available Dals are: "+dals.length);
	for(String dal : dals){
		System.out.println(dal);
	}
	System.out.println("\n The Available Rices are: "+rices.length);
	for(String rice : rices){
		System.out.println(rice);
	}
}
}
