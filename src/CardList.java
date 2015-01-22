// create class CardList
import java.util.*;
public class CardList
{
  private ArrayList<Card> cards;
  private Random random=new Random();
  public CardList()
  {
    cards=new ArrayList<Card>();
  }
  public int getSize()
  {
    return cards.size();
  }
  public void addCardToBottom(Card card)
  {
    cards.add(card);
  }
  public void addCardToTop(Card card)
  {
    cards.add(0,card);
  }
  public Card takeCardFromTop()
  {
    Card temp=cards.get(0);
    cards.remove(0);
    return temp;
  }
  public Card removeRandomCard()
  {
    int x=random.nextInt(cards.size());
    Card temp=cards.get(x);
    cards.remove(x);
    return temp;
  }
}
