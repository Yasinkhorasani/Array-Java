package grundlagen;

/**
 * Demonstriert die Verwednung von Methoden.
 * 
 * Methoden: eine Funktionalität wird wieder verwendet
 * Methode: ein Modul, das eine Funktionalität zusammenfasst
 * @author Yasin
 *
 */
public class Modularisierung {

	/**
	 * Eine Methode/ein Modul, das die Anwendung startet und den Lebenszyklus der
	 * Anwendung organisiert
	 * @param args wird hier nicht verwendet
	 */
	public static void main(String[] args) {
		System.out.println("Hier geht es los");
		
		erstellenEinerTrennlinie();
		System.out.println("Jetzt führt das Programm einige spannende Dinge durch......");
		System.out.println("Das Thema ist abgeschlossen, jetzt folgt ein neues Thema");
		
		String neuesThema = "Methoden mit Parametern";
		erstellenEinerTrennlinie(neuesThema);
		System.out.println(neuesThema +"wurde berarbeitet....es geht weiter");
		
		neuesThema = "Mathematik";
		erstellenEinerTrennlinie(neuesThema);
		
		int ergbnis = multiplizieren(6, 7);
		System.out.println("Die Methode hat den Wert: " + ergbnis + " produziert");
		
		int zahl1 = 17;
		int zahl2 = 4;
		System.out.println(zahl1+ " * " + zahl2 +" = " + multiplizieren(zahl1, zahl2));
//		System.out.println(erstellenEinerTrennlinie()); 
		//Nicht möglich: erstellenEinerTrennlinie-Methode hat Rückgabetyp void
		
		erstellenEinerTrennlinie("Tauschversuche in Methoden");
		System.out.println("Gibt dein Vornamen ein");
		String vorname = new java.util.Scanner(System.in).nextLine();
		System.out.println("Gib deinen Nachnamen ein");
		String nachname = new java.util.Scanner(System.in).nextLine();
		System.out.println("Hast du es richtig eingeben? ja: 1, nein 0");
		int eingabe = new java.util.Scanner(System.in).nextInt();
		if(eingabe == 0) {
			System.out.println("Methodenaufruf?");
			tauschen(vorname, nachname);
		}
		System.out.println("Willkommen " + vorname + " " + nachname);
		
		
		System.out.println("Das ist das Ende");
	}
	
	/**
	 * Diese Methode verscuht zu tauschen den Wert den Wert von zwei String aus
	 * Das ist nicht möglich!
	 * Parameter sind Kopien der Werte, die beim Aufruf übergeben werden
	 * "Call By Value"
	 * @param vorname erster eingegebener Parameter
	 * @param nachname zweiter eingegebener Parameter
	 */
	public static void tauschen(String vorname, String nachname) {
		String helfer = vorname;
		vorname = nachname;
		nachname = helfer;
	}
	
	
	/**
	 * Hier werden zwei int-Zahlen miteinander multipliziert.
	 * 
	 * @param zahlEins erster Faktor der Multiplikation
	 * @param zahlZwei zweiter Faktor der Multiplikation
	 * @return Ergebnis der Multiplikation
	 */
	public static int multiplizieren(int zahlEins, int zahlZwei) {
		int produkt = zahlEins * zahlZwei;
		return produkt;
	}

	/**
	 * Erstellt eine Trennline, die angibt, welches Thema als nächstes behandelt werden soll
	 * Methodenname wird weiter verwendet, Parameter-Liste ändert sich: ÜBERLADEN einer Methode
	 * @param thema wird in der Mitte der Trennlinie angezeigt
	 */
	public static void erstellenEinerTrennlinie(String thema) {
		System.out.println("\n===================================================");
		System.out.println("=========" + thema + "============================");
		System.out.println("==================================================\n");
	}

	/**
	 * Modul, das beschreibt, wie ein Trennline aussieht und sie zeichnet:
	 * Lösung: Methode
	 * 1: Zugriffsmodifier: Gibt an WER die Methode beauftragen, AUFRUFEN, darf: hier public
	 * 		static: sonst kann die Methode nicht aus der main-Methode aus aufgerufen werden (nur hier)
	 * 2: Rückgabe-Typ: Gibt an, welche Art von Wert diese Methode produzieren kann (falls sie 
	 * 		etwas produziert). Falls keine Rückgabe produziert wird: void
	 * 		void: die Methode liefert dem Aufrufer kein Ergebnis
	 * 3: Bezeichner: Konvention: startet mit einem Kleinbuchstaben, dann CamelCase, ist meist ein Verb
	 * 		Beschreibt den Vorgang, der in diesem Modul durchgeführt wird
	 * 4: (
	 * 5: 0 bis viele Variablen-Deklarationen, die mit Komma getrennt werden: Parameter
	 * 6: )
	 * 7: {   Methodenkörper.... }
	 */
	public static void erstellenEinerTrennlinie() {
		System.out.println("\n----------------------------------------------------------");
		System.out.println("-----------------Ein neues Thema startet-------------------");
		System.out.println("-----------------------------------------------------------\n");
	}
}
