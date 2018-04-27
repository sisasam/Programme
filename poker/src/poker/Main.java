package poker;



public class Main {
	
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

	public static void main(String[] args) 
	{
		Card deck[] = new Card [52];
		genCardDeck(deck);
		for (int i = 0; i < deck.length; i++)
		{
			System.out.println(deck[i].toString());
		}
		
	}

}
