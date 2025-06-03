
public class Car {
	int x,y;
	public Car(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame1) {
		frame1.fillRect(x+70, y+70, 100, 50);
		frame1.fillRect(x+20, y+120, 200, 50);
		frame1.fillOval(x+45, y+170, 50, 50);
		frame1.fillOval(x+145, y+170, 50, 50);
	}
}
