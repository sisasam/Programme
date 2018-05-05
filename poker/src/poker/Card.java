package poker;

public class Card 
{
	/**
	 * Card Element erstellt eine Karte der Pokerspiels
	 * Eigenschaften der Farbe und des Werts der jeweiligen Karte
	 * 	imDeck zeigt an, ob die Karte sich noch im Deck befindet oder schon gezogen wurde
	 */
	private String farbe;
	private String wert;
	private boolean imDeck;
	
	public String getFarbe() 
	{
		return farbe;
	}
	public void setFarbe(String farbe) 
	{
		this.farbe = farbe;
	}
	
	
	public String getWert() 
	{
		return wert;
	}
	public void setWert(String wert) 
	{
		this.wert = wert;
	}
	
	
	@Override
	public String toString() 
	{
		return farbe + " " + wert;
	}

	public boolean getImDeck() 
	{
		return imDeck;
	}
	public void setImDeck(boolean imDeck) 
	{
		this.imDeck = imDeck;
	}
	
	
	
	public static void main(String[] args) 
	{
		
	}
	

}
