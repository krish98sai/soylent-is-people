package com.soylentispeople.map;

/**
 * Created by krish98sai on 1/21/2017.
 */
public class Line {
    private float slope, yIntercept;

    public Line(float slope, float yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public Line(Point p1, Point p2) {
        this.slope = (p2.y - p1.y)/(p2.x - p1.x);
        this(, );
    }

    public Point intercept(Line line) {
        float xIntercept = (line.yIntercept - this.yIntercept)/(this.slope - line.slope);
        float yIntercept = xIntercept * slope + this.yIntercept;

        return new Point(xIntercept, yIntercept);
    }

}
