import java.util.ArrayList;
import java.util.HashMap;

/*
 * ID: TODO: please add student ID here
 * Name: TODO: please add student name here
 */
public class HW2 {

	public static void main(String[] args) {
		int nDeck=Integer.parseInt(args[0]);
		Deck deck=new Deck(nDeck);
		deck.printDeck();
		
		if(isAllCardsCorrect(deck.getAllCards(),nDeck)){
			System.out.println("Well done!");
		}else{
			System.out.println("Error, please check your sourse code");
		}
	}
	/*
	 * This method is used for checking your result, not a part of your HW
	 */
	private static boolean isAllCardsCorrect(ArrayList<Card> allCards,int nDeck){
		//check the output 
		boolean isCorrect=true;;
		HashMap <String,Integer> checkHash=new HashMap<String,Integer>();
		for(Card card:allCards){
			int suit= card.getSuit();
			int rank = card.getRank();
			if(suit>13||suit<1||rank>4||rank<1){
				isCorrect=false;
				break;
			}
			if(checkHash.containsKey(suit+","+rank)){
				checkHash.put(suit+","+rank, 
						checkHash.get(suit+","+rank)+1);
			}else{
				checkHash.put(suit+","+rank, 1);
			}

		}
		if(checkHash.keySet().size()==52){
			for(int value:checkHash.values()){
				if(value!=nDeck){
					isCorrect=false;
					break;
				}
			}
		}else{
			isCorrect=false;
		}
		return isCorrect;
	}

}
/*
 * Description: TODO: please add description here
 */
//TODO: Please implement the class
class Deck{
	private ArrayList<Card> cards;
	//TODO: Please implement the constructor
	public Deck(int nDeck){
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and for loop to add card into deck
		//Sample code start
		//Card card=new Card(1,1);
		//cards.add(card);
		//Sample code end
	}	
	//TODO: Please implement the method to print all cards on screen
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards
	}
	//TODO: Please implement the method to return all class in 
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
/*
 * Description: TODO: 
 */
//TODO: Please implement the class
class Card{
	private int suit; //Definition: Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13
	//TODO: Please implement the constructor
	public Card(int s,int r){
		suit=s;
		rank=r;
	}	
	public void printCard(){
		//Hint: print card as suit,rank, for example: 1,1 as Clubs Ace
	}
	public int getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}