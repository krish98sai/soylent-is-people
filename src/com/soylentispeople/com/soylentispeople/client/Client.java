package com.soylentispeople.com.soylentispeople.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by adity on 1/21/2017.
 */
public class Client {
    public static final int PORT = 0;
    public static final String IP = "localhost";


    public static void main(String[] args) throws IOException{
        Socket s = new Socket(IP,PORT);
        MessageReciever m = new MessageReciever(s.getInputStream());
        Scanner in = new Scanner(System.in);

        while(true){
            String x = in.next();
            byte b = (byte)Integer.parseInt(x);
            s.getOutputStream().write(b);
            s.getOutputStream().flush();
        }
    }


}
