
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ARIFIN
 */
public class AppletTest extends Applet implements Runnable {

    private Thread runner;
    private int x = 0, y = 0;

    public void init() {
        // TODO start asynchronous download of heavy resources

    }

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop() {
        if (runner != null) {
            runner.stop();
            runner = null;
        }

    }

    public void run() {
        while (true) {
            try {
                runner.sleep(250);
            } catch (Exception e) {
            }
            if (x <= 400) {
                x = x + 10;
            } else {
                x = 0;
            }

            if (y <= 400) {
                y = y + 10;
            } else {
                y = 0;
            }

            repaint();
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }
}
