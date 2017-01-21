package com.soylentispeople.map;

import javax.swing.*;
import java.awt.*;

/**
 * Created by krish98sai on 1/21/2017.
 */
public class MapTestMain {

    public static void main(String[] args) {

        Polygon poly = new Polygon(new Point[] {
                new Point(120, 120),
                new Point(400, 120),
                new Point(400, 400),
                new Point(120, 400)});

        Point p1 = new Point(500, 500);
        Point p2 = new Point(800, 350);

        JFrame frame = new JFrame("Map Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.add(new TestPanel(poly, p1, p2));
        frame.setVisible(true);
    }

    static class TestPanel extends JPanel {
        private Polygon poly;
        private Point p1, p2;

        public TestPanel(Polygon poly, Point p1, Point p2) {
            this.poly = poly;
            this.p1 = p1;
            this.p2 = p2;
        }

        @Override
        public void paintComponent(Graphics g) {
            int[] ptsX = new int[poly.getPoints().length];
            int[] ptsY = new int[poly.getPoints().length];
            for (int i = 0; i < ptsX.length; i++) {
                ptsX[i] = (int)poly.getPoints()[i].x;
                ptsY[i] = (int)poly.getPoints()[i].y;
            }

            g.drawPolygon(ptsX, ptsY, ptsX.length);
            g.drawLine((int)p1.x, (int)p1.y, (int)p2.x, (int)p2.y);
        }
    }
}
