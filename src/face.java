
public class face {
	int x,y;
	public face(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x, y, 50, 100);
		frame.fillOval(x+100, y, 50, 100);
		frame.fillRect(x, y+160, 150, 10);
	}

}
