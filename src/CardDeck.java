// create class CardDeck that extends CardList
public class CardDeck extends CardList
{
  private int suits;
  private int ranks;
  private int swaps=10000;
  
  public CardDeck()
  {
    Card temp;
    for(int suit=1; suit<=suits; suit++)
    {
      for(int rank=1; rank<=ranks; ranks++)
      {
        temp=new Card(suit, rank);
        this.addCardToBottom(temp);
      }
    }
  }
  public void Shuffle()
  {
    Card card;
    for(int count=0; count<10000; count++)
    {
      card=this.removeRandomCard();
      this.addCardToBottom(this.removeRandomCard());
    }
  }
}
