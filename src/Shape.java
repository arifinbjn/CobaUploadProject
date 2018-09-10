
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Shape extends Applet {

    int a = 2, b = 5, c = 2;

    public void paint(Graphics g) {
        g.drawRect(40, 20, 20, 20);
        //g.setColor(Color.red);
        g.fillOval(40, 20, 20, 20);
        //g.setColor(Color.green);
        
    }
}
    

