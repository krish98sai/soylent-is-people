package com.soylentispeople.map;

/**
 * Created by krish98sai on 1/21/2017.
 */
public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public boolean intersects(Point p1, Point p2) {
        Line interLine = new Line(p1, p2);
        if(interLine.getSlope() == 0) {
            for (int i = 0; i < points.length; i++) {
                Line polyLine = new Line(points[i], points[(i + 1) % points.length]);

                if(polyLine.getSlope() == 0) {
                    if(points[i].y == p1.y) {
                          if(points[i].x == p1.x && points[]) {

                          }
                    }
                }
            }
        } else if(Float.isInfinite(interLine.getSlope())) {

        } else {

        }

        return false;
    }

    public Point[] getPoints() {
        return points;
    }

}