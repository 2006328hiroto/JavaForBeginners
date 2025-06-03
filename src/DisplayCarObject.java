
public class DisplayCarObject extends MyFrame{
	public void run() {
		Car car1=new Car(30,30);
		car1.draw(this);
		Car car2=new Car(300,150);
		car2.draw(this);
		
		for(int i = 0; i < 30; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.x += 10;
			car2.x -=10;
			sleep(0.1);
		}
	}
	

}
