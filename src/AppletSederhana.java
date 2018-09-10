/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARIFIN
 */
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class AppletSederhana extends java.applet.Applet {

    Font f = new Font("Times Roman", Font.BOLD, 16);

    public void paint(Graphics g) {
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Times Roman", 5, 50);

    }

}
