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
            return interLineZero(p1, p2);
        } else if(Float.isInfinite(interLine.getSlope())) {

        } else {

        }

        return false;
    }

    private boolean interLineZero(Point p1, Point p2){
        Point interMaxXPoint = getMaxXPoint(p1, p2);
        Point interMinXPoint = interMaxXPoint == p1 ? p2 : p1;
        for (int i = 0; i < points.length; i++) {
            Line polyLine = new Line(points[i], points[(i + 1) % points.length]);

            if(polyLine.getSlope() == 0) {
                if(points[i].y == p1.y) {
                    Point polyMaxXPoint = getMaxXPoint(points[i], points[(i + 1) % points.length]);
                    Point polyMinXPoint = polyMaxXPoint == points[i] ? points[(i + 1) % points.length] : points[i];

                    if((polyMaxXPoint.x > interMinXPoint.x) && (polyMinXPoint.x < interMaxXPoint.x)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private Point getMaxXPoint(Point p1, Point p2){
        return p1.x > p2.x ? p1 : p2;
    }

    public Point[] getPoints() {
        return points;
    }

}