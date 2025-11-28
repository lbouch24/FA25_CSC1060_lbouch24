import java.util.Random;
public class Deck {
	private Card[] cards;
	public Deck(int n)
	{
		this.cards = new Card[n];
	}
	public Deck()
	{
		this.cards = new Card[52];
		int index = 0;
		for(int suit = 0; suit < 4; suit++){
			for(int rank = 1; rank <= 13; rank++)
			{
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	public void shuffle()
	{
		for(int i = 0; i < cards.length; i++)
		{
			int rand = randomInt(0, 51);
			swap(i, rand);
		}
	}
	private void swap(int i, int rand) {
		Card temp = cards[i];
		cards[i] = cards[rand];
		cards[rand] = temp;
	}
	private int randomInt(int low, int high) {
		Random rand = new Random();
		int num = rand.nextInt(high - low)+ low;
		return num;
	}
	public Card[] getCards(){
		return this.cards;
	}
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low +1);
		for(int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	public void print()
	{
		int index = 0;
		for(Card card : this.cards) 
		{
			System.out.println("" + card +", ");
			index++;
			if(index %13 == 0) System.out.println();
		}
	}
}
