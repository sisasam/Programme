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
	
	public static void eingabe(String ein)
	{
		double Gleitzahl = 0.0;
		boolean Wiederholen = true;
			while (Wiederholen)
			{
			try 
			{
				ein = (new BufferedReader(new
				InputStreamReader(System.in))).readLine();
				Gleitzahl = Double.parseDouble(ein);
				System.out.println(" ");
				Wiederholen = false;
			}
			catch(Exception ex) 
			{
				System.out.println("Falsche Eingabe!");
			}
			}
	}
	/*
	public static void spiel(Card[] deck, int Anz)
	{
		try
		{
			
		}
	}
	*/
	public static void main(String[] args) 
	{
		Card deck[] = new Card [52];
		String ein = "";
		genCardDeck(deck);
/*		for (int i = 0; i < deck.length; i++)	//Ausgabe des nicht sortierten Decks
		{
			System.out.println(deck[i].toString());
		}
		System.out.println(" ");
*/		mischen(deck);
		for (int i = 0; i < deck.length; i++)	//Ausgabe des sortierten Decks
		{
			System.out.println(deck[i].toString());
		}
		
		System.out.print("Geben Sie die Anzahl der Spieler an(3-6 Spieler) : ");
		
		int pruef = 0;
		boolean Wiederholen = true;
		while (Wiederholen || pruef > 6 || pruef < 2)	//Damit funktioniert die Überprüfung der Anzahl
		{
			try 
			{
				ein = (new BufferedReader(new
				InputStreamReader(System.in))).readLine();
				pruef = Integer.parseInt(ein);
				System.out.println(" ");
				Wiederholen = false;
			}
			catch(Exception ex) 
			{
					System.out.println("Falsche Eingabe!");
			}
		}
	}
		
/*		
		boolean wiederholen = true;
		while (wiederholen = true);
		{	
			eingabe(ein);
			if (Double.parseDouble(ein) <= 6 && Double.parseDouble(ein) >= 3)
			{
				wiederholen = false;
			}
		}
		System.out.print("Fertsch");
	}
*/
}
