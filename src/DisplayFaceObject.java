public class DisplayFaceObject extends MyFrame {
    public void run() {
        Face1[] faces = new Face1[3];
         
        faces[0] = new Face1(50, 50, 10, 5);
        faces[1] = new Face1(200, 100, -10, -5);
        faces[2] = new Face1(0, 100, 5, 0);

        for (int i = 0; i < 30; i++) {
            clear();
            for (int j=0; j<3; j++) {
            	faces[j].draw(this);
            }

            for (int j=0; j<3; j++) {
            	faces[j].move();

            sleep(0.1);
        }
    }
    }
}
