package com.soylentispeople.servernet;
import java.net.ServerSocket;

/**
 * Created by thatq on 1/21/2017.
 */
public class ConnectionReceiver implements Runnable{
    public ConnectionReceiver(Socket [] s, ServerSocket serverSocket){
        for (int i = 0; i < s.length; i++){
            s[i] = serverSocket.accept();
            //Hi There
        }
    }
}
