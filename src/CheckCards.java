import java.util.*;
import java.awt.*;
import javax.swing.*;
public class CheckCards extends Deck {
	public CheckCards() {
		System.out.println("Copy and paste in 3 cards and see if you have a set");
		for(int i = 0; i<13; i++) {
			String tempStoreShape = cards.get(i).shape;
			int tempStoreNum = cards.get(i).number;
			String tempStoreShade = cards.get(i).shade;
			String tempStoreColor = cards.get(i).color;
			System.out.println(tempStoreShape + " " + tempStoreNum + " " + tempStoreShade + " " + tempStoreColor);
			
		}
		Scanner input1 = new Scanner(System.in);
		String Check1 = input1.nextLine();
		Scanner input2 = new Scanner(System.in);
		String Check2 = input2.nextLine();
		Scanner input3 = new Scanner(System.in);
		String Check3 = input3.nextLine();
		
		String x = Check1;
		String y = Check2;
		String z = Check3;
		System.out.println(x + " " + y + " " + z); 
		
		if(x == y) {
			if (y == z) {
				
				System.out.println("SET!");
				
			}
			
		}else if(x != y) {
			if(y != z) {
				
				System.out.println("SET!");
				
			}	
			
		}else {
			
			System.out.println("Try Again");
			
		}
	}
}
