package poker;

public class Player 
{
	/**
	 * Player Klasse erstellt einen Spieler des Pokerspiels
	 * Besitzt die Eigenschaften
	 * 		Einsatz Speichert für jeden Spieler seinen gesamt getätigten Einsatz
	 * 		Zwei Karten die jeder Spieler auf der Hand hat
	 */
	private double einsatz;
	private Card ersteKarte;
	private Card zweiteKarte;
	

	public Card getErsteKarte() 
	{
		return ersteKarte;
	}
	public void setErsteKarte(Card ersteKarte) 
	{
		this.ersteKarte = ersteKarte;
	}
	
	
	public Card getZweiteKarte() 
	{
		return zweiteKarte;
	}
	public void setZweiteKarte(Card zweiteKarte) 
	{
		this.zweiteKarte = zweiteKarte;
	}
	
	
	public double getEinsatz() 
	{
		return einsatz;
	}
	public void setEinsatz(double einsatz) 
	{
		this.einsatz = einsatz;
	}
	
	
	
	public static void main(String[] args) 
	{
		
	}
}
