package com.soylentispeople.servernet;
import java.net.*;
import java.io.IOException;

/**
 * Created by thatq on 1/21/2017.
 */
public class ConnectionReceiver implements Runnable{
    private final Socket [] sockets;
    private final ServerSocket serverSocket;
    private final ConnectionReceiverListener listener;

    public ConnectionReceiver(Socket [] sockets, ServerSocket serverSocket, ConnectionReceiverListener listener) {
        this.sockets = sockets;
        this.serverSocket = serverSocket;
        this.listener = listener;
    }

    @Override
    public void run() {
        System.out.println("Connection Receiver started");
        for (int i = 0; i < sockets.length; i++){
            if (sockets[i] == null) {
                try {
                    System.out.println("Receiver waiting for connection");
                    sockets[i] = serverSocket.accept();
                    listener.connectionEstablished(i);
                } catch (IOException e) {
                    System.out.println("Connection Failed");
                }
            }
        }
    }
}
