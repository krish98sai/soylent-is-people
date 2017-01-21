package com.soylentispeople.map;

/**
 * Created by krish98sai on 1/21/2017.
 */
public class Point {

    public float x;
    public float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float distanceTo(Point p){
        return (float) Math.sqrt(Math.pow(p.y - y, 2) + Math.pow(p.x - x, 2));
    }
}
