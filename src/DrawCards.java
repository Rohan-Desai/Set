import java.awt.*;
import javax.swing.*;
public class DrawCards extends JPanel {
		
	public void draw(){
		
		repaint();
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		for(int i = 0; i<4; i++) {
			for(int j = 0; j <3; j ++) {
				g.fillRect(i*110, j*110, 100, 100);
				
			}
		}
	}
}
