
public class Face1  {
	int x,y;
	public Face1(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame1) {
		frame1.fillOval(x, y, 50, 100);
		frame1.fillOval(x+100, y, 50, 100);
		frame1.fillRect(x, y+160, 150, 10);
	}

}


