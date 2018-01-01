import java.util.ArrayList;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] shapes = {"Diamond" , "Oval" , "Squiggly"};
		String[] colors = {"Green", "Purple", "Red"};
		String[] shades = {"Solid", "Striped", "None"};
		
		for (int number = 1; number <= 3; number++) {
			for (String shape: shapes) {
				for (String color: colors) {
					for (String shade: shades) {
						Card card = new Card(shape,shade,color,number);
						cards.add(card);
					}
				}
			}
		}
		
		int count = 0;
		for(Card card : cards) {
			count++;
		}
	}	
	
	
}
