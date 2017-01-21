package com.soylentispeople.servernet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by adity on 1/21/2017.
 */
public class ServerTestMain {
    public static void main(String[] args) throws IOException {
        Socket[] sockets = new Socket[5];
//
        new Thread(new ConnectionReceiver(sockets, new ServerSocket(24999), new ConnectionReceiverListener() {
            @Override
            public void connectionEstablished(int index) {
                System.out.println("Connection established at index: " + index);
            }
        })).start();

        for(int i = 0; i < 5; i++) {
            new Socket("localhost", 24999);
        }
    }

}
