package poker;
import java.io.*;
import java.util.Random;

public class Main 
{
	
	static Random zufall = new Random();
	/**
	 * 
	 * @param deck	Array der Klasse Card wird übergeben
	 * @brief		Das Array wird "mit Karten gefüllt"
	 * 				jeder Karte wird farbe und wert zugeordnet
	 */
	public static void genCardDeck (Card[] deck)
	{
		final String farben[] = { "Kreuz", "Pik", "Herz", "Karo" };
		final String werte[] = {"Ass", "König", "Dame", "Bube", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		int i = 0;
		for (String f : farben)
		{
			for (String w : werte)
			{
				deck[i] = new Card();
				deck[i].setFarbe(f);
				deck[i].setWert(w);
				deck[i].setImDeck(true);
				i++;
			}
		}
	}
	/**
	 * 
	 * @param deck	Array der Klasse Card
	 * 
	 * @brief	Klasse bekommt das erstellte Array übergeben und vertauscht 
	 * 			mind. 500mal jeweils 2 zufällige Karten
	 */
	public static void mischen (Card[] deck)
	{
		for (int i=0; i < zufall.nextInt(500)+500; i++)
		{
			int a =zufall.nextInt(52);
			int b = zufall.nextInt(52);
			
			Card h = deck[a];
			deck[a] = deck[b];
			deck[b] = h;
		}
	}
	
	/**
	 * 
	 * @param ein	User input einer double Zahl
	 * @return		gibt die Eingabe unverändert zurück
	 */
	public static double eingabe(String ein)
	{
		double gleitzahl = 0.0;
		boolean wiederholen = true;
		while (wiederholen)
		{
			try 
			{
				ein = (new BufferedReader(new
				InputStreamReader(System.in))).readLine();
				gleitzahl = Double.parseDouble(ein);
				System.out.println(" ");
				wiederholen = false;
			}
			catch(Exception ex) 
			{
				System.out.println("Falsche Eingabe!");
			}
		}
		return gleitzahl;
	}
	
	/**
	 * 
	 * @param deck	Einzel Elemente aus dem deck[] werden zufällig ausgewählt
	 * @return		als Card Element ausgegeben
	 */
	public static Card austeilen(Card[] deck)
	{
		int a = zufall.nextInt(deck.length);
		Card ausgabe = deck[a];
		if (ausgabe.getImDeck())
		{
			{
				deck[a].setImDeck(false);
			}
		}
		else
		{
			while (!ausgabe.getImDeck())
			{
				a = zufall.nextInt(deck.length);
				ausgabe = deck[a];
			}
			deck[a].setImDeck(false);
		}
		return ausgabe;
	}
	
	public static Game spielErstellen(Card[] deck)
	{
		Game spiel = new Game();
		Card[] tisch = new Card[5];
		for (int i = 0; i < 5; i++) 
		{
			tisch[i] = austeilen(deck);
		}
		
		spiel.setTisch(tisch);
		
		return spiel;
	}
	
	public static void main(String[] args) 
	{
		Card[] deck = new Card [52];
		String ein = "";
		genCardDeck(deck);

		mischen(deck);
		
		double anz =0.0;
		do
		{
			System.out.print("Geben Sie die Anzahl der Spieler an(3-6 Spieler) : ");
			anz = eingabe(ein);
		}
		while (anz < 3 || anz > 6);
		
		Player[] spieler = new Player [(int) anz];
		for (int i = 0; i < spieler.length; i++)
		{
			spieler[i] = new Player();
			spieler[i].setErsteKarte(austeilen(deck));
			spieler[i].setZweiteKarte(austeilen(deck));
		}

		
/**
 *		Prüfen des gemischeten Decks 		
 *
 *		for (int i = 0; i < deck.length; i++)
 *		{
 *			System.out.println(deck[i].toString());
 *		}
 *		
 */	
		Game spiel = new Game();
		spiel = spielErstellen(deck);
		
		//Runde 1 -- 3 Ramdome Card Elemente werden offen auf den Tisch gelegt, nachdem jeder Spieler seine Einsätze getätigt hat.
		for (int i = 0; i < spieler.length; i++)
		{
			System.out.println("Spieler" + (i+1) + " Einsatz?");
			String eingabe=" ";
			spieler[i].setEinsatz(eingabe(eingabe));
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(spiel.getTisch()[i]);
		}
		
		//Runde 2 -- 	Startet mit erneuten Einsätzen, welche auf die aktuellen Einsätze aufaddiert werden 
		// 				folgend wird der Turn gezogen
		for (int i = 0; i < spieler.length; i++)
		{
			System.out.println("Spieler" + (i+1) + " Einsatz?");
			String eingabe=" ";
			int temp = 0;
			temp = (int) (spieler[i].getEinsatz() + eingabe(eingabe));
			spieler[i].setEinsatz(temp);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(spiel.getTisch()[i]);
		}
		
		//Runde3
		for (int i = 0; i < spieler.length; i++)
		{
			System.out.println("Spieler" + (i+1) + " Einsatz?");
			String eingabe=" ";
			int temp = 0;
			temp = (int) (spieler[i].getEinsatz() + eingabe(eingabe));
			spieler[i].setEinsatz(temp);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(spiel.getTisch()[i]);
		}
		
		//letzte Runde
		for (int i = 0; i < spieler.length; i++)
		{
			System.out.println("Spieler" + (i+1) + " Einsatz?");
			String eingabe=" ";
			int temp = 0;
			temp = (int) (spieler[i].getEinsatz() + eingabe(eingabe));
			spieler[i].setEinsatz(temp);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(spiel.getTisch()[i]);
		}
		for (int i = 0; i < spieler.length; i++) 
		{
			System.out.println("Spieler" + (i+1) + " Karten: " + spieler[i].getErsteKarte() + " & " + spieler[i].getZweiteKarte());
		}
		
		/**
		 * 
		 *
		*	//Test der geamten Einsätze
			System.out.println(spieler[0].getEinsatz());
			System.out.println(spieler[1].getEinsatz());
			System.out.println(spieler[2].getEinsatz());
		*/
	}
		
}


