import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	public Car(int x, int y, int vx, int vy) {
	    super(x, y, vx, vy);
	}

	public void draw(MyFrame frame1) {
		frame1.fillRect(x+20, y, 40, 20);
		frame1.fillRect(x, y+20, 80, 20);
		frame1.fillOval(x+10, y+40, 20, 20);
		frame1.fillOval(x+50, y+40, 20, 20);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=5;
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=0;
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
