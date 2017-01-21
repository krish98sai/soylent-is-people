package com.soylentispeople.map;

/**
 * Created by Yuval Shabtai on 1/21/2017.
 */
public class Node {

    private Node[] connectedNodes;

    public Node() {

    }

    public void setConnectedNodes(Node[] nodes) {
        this.connectedNodes = nodes;
    }

    public Node[] getConnectedNodes() {
        return connectedNodes;
    }
}
