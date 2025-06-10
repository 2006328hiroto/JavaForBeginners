
public class Face1  {
	int x,y,vx,vy;
	public Face1(int x,int y, int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx = vx;
        this.vy = vy;
	}
	public void draw(MyFrame frame1) {
		frame1.fillOval(x, y, 50, 100);
		frame1.fillOval(x+100, y, 50, 100);
		frame1.fillRect(x, y+160, 150, 10);
	}
	 public void move() {
	        x += vx;
	        y += vy;
	 }

}


