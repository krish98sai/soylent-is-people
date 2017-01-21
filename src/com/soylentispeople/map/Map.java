package com.soylentispeople.map;

/**
 * Created by Yuval Shabtai on 1/21/2017.
 */
public class Map {

    private float xSize, ySize;
    private Node[] nodes;
    private Polygon[] polygons;

    public Map(float xSize, float ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }
}
