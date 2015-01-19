public class Card extends PlayingCard implements Comparable <Card>
{
  
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  
  public int compareTo(Card other)
  {return 0;}
  
  public String toString()
  {
    String result="";
    if (getRank()==1)
    {
      result="A--";
    }
    else if (getRank()==11)
    {
      result="J--";
    }
    else if (getRank()==12)
    {
      result="Q--";
    }
    else if (getRank()==12)
    {
      result="K--";
    }
    else
    {
      result=getRank()+"";
    }
    if (getSuit()==1)
    {
      result+="-D";
    }
    if (getSuit()==2)
    {
      result+="-C";
    }
    if (getSuit()==3)
      result+="-H";
    if (getSuit()==4)
    {
      result+="-S";
    }
    return result;
  }
}
