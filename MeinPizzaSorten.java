package de.yasin.pizzaria;
/*
* Übung1: Projekt Pizzeria: 
* Methode: Interaktiv erfragen, wie viele Sorten Pizza angeboten werden sollen
main-Methode: erstellen des Pizza-Sorten Arrays und zum Teil Sorten initialisieren
* Methode: Interaktiv fehlende Sorten ergänzen String neueSorte: new java.util.Scanner(System.in).nextLine();
if(str == null){...}
* Methode: Interaktiv Preise zu den Pizza-Sorten erfragen double neuerPreis: new java.util.Scanner(System.in).nextDouble();
if(preis ==0.0) Eingabe eins double: 3,99 (Eingabe , als Nachkommatrennzeichen)
* Methode: Interaktiv fehlende Bestellnummern ergänzen int neueBestellnummer: new java.util.Scanner(System.in).nextInt();
* if(bestellNummer == 0)
* 
* Abschließend eine "schöne" Ausgabe der Karte
* 
* Übung 1a:(evtl)
* Methode: Preise über 8 € sollen um 1 € verringert werden(optional) //Preise unter 3 € um 10 Cent erhöhen....
* 
 Übung 2 Zusatz zu Projekt Pizzeria

* 1. Array, das alle Wochentage enthält
* 2. Array von Lieblingsgerichten (weniger oder mehr als 7 Lieblingsgerichte)
* 3. Ausgabe: einen Monat lang anzeigen was gegessen wird(30 oder 31, je nach Wunsch)
*/

/**
 * 
 * @author Yasin
 *
 */

public class MeinPizzaSorten {

	public static void main(String[] args) {
		
	
		String[] pizzaSorten;
		pizzaSorten = new String[6];

		int anzahlDerPizzaSorten = pizzaSorten.length;

		pizzaSorten[0] = "Margarita";
		pizzaSorten[1] = "Pizza Salami";
		pizzaSorten[2] = "Pizza Diavolo";
		pizzaSorten[3] = "Pizza Spinachi";
		pizzaSorten[4] = "Pizza Hawai";
		
		double[] preice = {3.50, 7.99, 10.99, 5.50, 12.80, 6.60};
		for (int i = 0; i < anzahlDerPizzaSorten; i++) {
			if(pizzaSorten[i] ==null) {
				pizzaSorten[i] = "Peperonie";
			}
			if (preice[i]> 8) {
				preice[i]=preice[i]-1;}
				else if(preice[i]< 8) 
				{preice[i]=preice[i]+ 0.10;}
			
			System.out.println("ihre Bestellung " + pizzaSorten[i] + " kostet " + preice[i]);
			
		}

		
	}
	
	
		
	
}

	
