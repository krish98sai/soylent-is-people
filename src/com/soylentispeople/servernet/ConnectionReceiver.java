package com.soylentispeople.servernet;
import java.net.*;
import java.io.IOException;

/**
 * Created by thatq on 1/21/2017.
 */
public class ConnectionReceiver implements Runnable{
    private final Socket [] sockets;
    private final ServerSocket serverSocket;
    public ConnectionReceiver(Socket [] s, ServerSocket serverSocket) {
        sockets = s;
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        for (int i = 0; i < sockets.length; i++){
            try {
                sockets[i] = serverSocket.accept();
            } catch (IOException e){
                System.out.println("Connection Failed");
            }
        }
    }
}
