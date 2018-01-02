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
			System.out.println(tempStoreShape + ", " + tempStoreNum + ", " + tempStoreShade + ", " + tempStoreColor);
			
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
		
		String[] check1 = x.split(",");
		String[] check2 = y.split(",");
		String[] check3 = z.split(",");
		for(int j = 0; j<4; j++) { 

		}
		boolean set = true;
		for(int i = 0; i<4; i++) {
			if(check1[i].equals(check2[i]) && check1[i].equals(check3[i]) || !check1[i].equals(check2[i]) && !check1[i].equals(check3[i]) && !check2[i].equals(check3[i])) {
				
				
				
				}else {
					
					set = false;
					
				}
		}
		if(set) {
			
			System.out.println("SET!");
			
		}
	}
}