package com.soylentispeople.servernet;

import com.soylentispeople.ads.Action;

import java.net.Socket;
import java.util.Queue;

/**
 * Created by Yuval Shabtai on 1/21/2017.
 */
public class SIPClient {

    private Queue<Action>
    private Socket socket;

    public SIPClient(Socket socket) {
        this.socket = socket;
    }
}
