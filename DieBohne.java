package de.bohne.alles;
//Entspricht den Phad/  de\bohne\alles

/**
 * demontrastion von verwendung von Arrays.
 * 
 * Erste Einstieg in Object-Orientierung in jva
 * 
 * Arrrays: Susammenfassung von gleischartige  Elemmente
 * Die Elemente mit gemeinsammen Bezeichner
 * 
 * Ein Array in Java in java ist ein OBJECT
 * @author Yasin
 *
 */
public class DieBohne {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println("###Anfang###\n");
	
	String lieblingsSortr =" LatteMachiato";
	String kateSorte ="EisKoffe";
	String alkoholSorte = "Wein";
	
	String[] sorten;// Deklaration von datentype Sring-Array.
	sorten = new String[5];
	// Erstellen ein Object mit 10  String untergbracht werden können.
	sorten[0] =" LatteMachiato";
	sorten[1]="EisKoffe";
	sorten[2]="EisKoffe";
	sorten[3]="Wasser";	
	sorten[4]=" vodka";
	
	for(int i= 0;i<5; i++) {
		System.out.println("Heute besonders lecker" + sorten[i]);
	}
	
	int anzahlDerSorten = sorten.length;
	double[] preise = new double[anzahlDerSorten];
	preise[0]= 3.99;
	preise[3]=0.99;
	
	int[] bestellNummern = {10,20,30,40,50};
	
	for(int i = 0; i< sorten.length; i++) {
		System.out.println("heute im Angebot" + sorten[i] + "für nur" + preise[i]+ "€"  + bestellNummern[i]);
	}
	
	
	System.out.println("\n###Ende###");

	}

}
