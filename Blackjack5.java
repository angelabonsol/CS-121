
public class Blackjack5 {
	static Random cardDeck =new Random();
		public static void main(String[]args)
		{
			//player 1 =21 = win
			//player 1 >21 = loss
			
			int player1=0;
			int player1Card=0;
			
			player1Card =cardDeck.nextInt(10) + 1;
			player1 =player1 + player1Card;
			System.out.println(player1Card);
			System.out.println(player1);
			
		}

}
