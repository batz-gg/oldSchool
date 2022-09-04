package com.codecade.my;

public class Language {
	
	protected String name;
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;
	
	Language(String langName, int speakers, String regions, String wdOrder) {
	    this.name = langName;
	    this.numSpeakers = speakers;
	    this.regionsSpoken = regions;
	    this.wordOrder = wdOrder;
	} 
		
	public void getInfo() {
		System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
		System.out.println("The language follows the word order: " + this.wordOrder + "\r\n");
	}	
	
	public static void main(String[] args) {
		 Language test = new Language("Mongolian", 32, "Ulanbator", "subject + object + verb.");
		 test.getInfo();
		 Language test1 = new Mayan("Ki'che", 2330000);
		 test1.getInfo();
		 Language test2 = new SinoTibetan("Chinese", 32000);
		 test2.getInfo();
		 SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
		 mandarin.getInfo();
		 SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
		 burmese.getInfo();
	}
}
