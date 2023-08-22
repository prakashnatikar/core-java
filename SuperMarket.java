class SuperMarket{
 static String Chocolate []={"dairymilk","cadbury","milkeybar","mintos","galaxy","centerfress","mangobyte","lacktokking","snikkers","5star","campko","kissme","kitkat","parlya","milki king",};
 static String Vegitable []={"caret","petato","tomato","onian","cabage","coliflower","betroot","ladyfinger","garlic","slice","magga","prime","brinjol","capsicam","chilli",};
 static String softdrinks []={"cocakola","pepsi","string","mirinda","leman","magga","thampsup","monstor","hell","tropican","slice","limca","bindu","sprite","fanta","jeera soda",};
 static String snacks []={"lagy","bingo","kurukurai","tooyam","saltedpenuts","kattamita","allobujiya","ratlamsew","doritos","oreo","cheetos","pringles","battani","botti","kadlebija",};
 static String soaps []={"dove","clinic","chick","lifeboy","medemix","mysursandlesoap","sintol","detol","santoor","himalaya","haman","lirali","jonson","pathanjali","garniyar",};
 static String Biscuts []={"parle-G","hide&seek","UNEBIC","sunfest","milana","keackjak","monaco","goodday","oria","mariliti","tiger","mariegold","creembiscuit","orengbiscute",};
 static String purfume []={"fogg","denver","parkvenue","KS","vilan","snick","beelavita","Engaga","yadyal","beardo","envy","he","axe","wildstone","mengmen",};
 static String masalas []={"chicken masala","matan masala","sabjimasala","cholayamasala","jeeramasala","chatmasala","pannermasala","eggmasala","biryanimasala","sukhamasala","soapmasala","masala",};
 static String dalls []={"chanadala","mongadalla","udadalla","thurdala","mososurdala","motedal","moonga","loba","chana","kabulichana","akkamasur","toor","avarikalla","rajma","udud",};
 static String Dairyitem []={"milk","curd","chees","ghee","butter","buttermilk","lashi","shreekand","milkshak","chocolatemilkshak","pannir","peda","kunda","burpy","sweetlashi",};
 
 public static void main (String args[]){
 System.out.println("main started");
 
 getChocolate();
 getVegitable();
 getsoftdrinks();
 getsnacks();
 getsoaps();
 getBiscuts();
 getpurfume();
 getmasala();
 getdalls();
 getDairyitem();
 
 
  System.out.println("main ended");
  }
  public static void getChocolate(){
  System.out.println("collection of Chocolate are");
  System.out.println(Chocolate.length);
  for(int cho=0;cho<Chocolate.length;cho++){
  System.out.println(Chocolate[cho]);
  }
  for (int cho=Chocolate.length-1;cho>=0;cho--){
  System.out.println(Chocolate[cho]);
  }
  }


public static void getVegitable(){
	System.out.println("collection of Vegitable are");
	System.out.println(Vegitable.length);
	for (int veg=0;veg<Vegitable.length;veg++){
	System.out.println(Vegitable[veg]);
	}
	for(int veg=Vegitable.length-1;veg>=0;veg--){
		System.out.println(Vegitable[veg]);
	}
	
}

public static void getSoftdrinks(){
	System.out.println("collection of softdrinks");
	System.out.println(softdrinks.length);
	for(int dri=0; dri<softdrinks.length;dri++){
	System.out.println(softdrinks[dri]);
	}
	for(int dri=softdrinks.length-1;dri>=0;dri--){
		System.out.println(softdrinks[dri]);
	}
}
public static void getsnscks(){
	System.out.ptintln("collection of snacks");
	System.out.println(snacks.length);
	for(int sna=0;sna<snacks.length;sna++){
		System.out.println(snacks[sna]);
	}
	for(int sna=snacks.length-1;sna>=0;sna--){
		System.out.println(snacks[sna]);
	}
}

public static void getsoaps(){
	System.out.println("collection of soaps");
	System.out.println(soaps.length);
	for (int soap=0; soap<soaps.length;soap++){
		System.out.println(soaps[soap]);
	}
	for (int soap=soaps.length-1;soap>=0;soap--){
		System.out.println(soaps[soap]);
	}
}




