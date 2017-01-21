package com.soylentispeople.ads;

import com.soylentispeople.map.Map;
import com.soylentispeople.map.Node;

/**
 * Created by Yuval Shabtai on 1/21/2017.
 */
public class ActionDescription {

    public static Node[] possibleMovements(Map map, Node node) {
        return node.getConnectedNodes();
    }
}
