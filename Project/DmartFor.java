class DmartFor{
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
	for(int choco = 0; choco < chocolates.length; choco++){
		System.out.println(chocolates[choco]);
	}
	System.out.println("\nThe perfumes available are: "+perfumes.length);
	for(int perf=0; perf < perfumes.length; perf++){
		System.out.println(perfumes[perf]);
	}
	System.out.println("\nThe Available groceries are : "+groceries.length); 
	for(int groce=0; groce<perfumes.length; groce++){
		System.out.println(groceries[groce]);
	}
	System.out.println("\nThe Available shampoos are: "+shampoos.length);
	for(int shamp=0; shamp < shampoos.length; shamp++){
		System.out.println(shampoos[shamp]);
	}
	System.out.println("\nThe Available conditioners are: "+conditioners.length);
	for(int cond=0; cond < conditioners.length; cond++){
		System.out.println(conditioners[cond]);
	}
	System.out.println("\nThe Available soaps are: "+soaps.length);
	for(int soap=0; soap < soaps.length; soap++){
		System.out.println(soaps[soap]);
	}
	System.out.println("\nThe Available Tooth paste are: "+toothPastes.length);
	for(int tooth = 0; tooth < toothPastes.length; tooth++){
		System.out.println(toothPastes[tooth]);
	}
	System.out.println("\nThe Available Mouth Washers are: "+mouthWashs.length);
	for(int mouth = 0; mouth < mouthWashs.length; mouth ++){
		System.out.println(mouthWashs[mouth]);
	}
	System.out.println("\nThe Available Shaving Creams are: "+shavingCreams.length);
	for(int shave = 0; shave < shavingCreams.length; shave++){
		System.out.println(shavingCreams[shave]);
	}
	System.out.println("\nThe Available Moisturisers are: "+moisturisers.length);
	for(int moist = 0; moist < moisturisers.length; moist++){
		System.out.println(shavingCreams[moist]);
	}
	System.out.println("\nThe Available Hand Lotions are: "+handLotions.length);
	for(int hand=0; hand < handLotions.length; hand++){
		System.out.println(handLotions[hand]);
	}
	System.out.println("\nThe Available Body Lotions are: "+bodyLotions.length);
	for(int body = 0; body < bodyLotions.length; body++){
		System.out.println(bodyLotions[body]);
	}
	System.out.println("\nThe Available Spices are: "+spices.length);
	for(int spice = 0; spice < spices.length; spice ++){
		System.out.println(spices[spice]);
	}
	System.out.println("\nThe Available Dals are: "+dals.length);
	for(int dal=0; dal < dals.length; dal++){
		System.out.println(dals[dal]);
	}
	System.out.println("\nThe Available Rices are: "+rices.length);
	for(int rice = 0; rice < rices.length; rice ++){
		System.out.println(rices[rice]);
	}
}
}
