package com.soylentispeople.com.soylentispeople.client;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by adity on 1/21/2017.
 */
public class MessageReciever implements Runnable {
    InputStream in;
    @Override
    public void run() {
        try{
            int length = in.read();
            byte[] message = new byte[length];
            while (length > 0) {
                length -= in.read(message, message.length - length, length);
            }
            String print = new String(message);
            System.out.println(print);
        }catch (IOException e){

        }

    }

    public MessageReciever(InputStream s){
        in = s;
        run();
    }
}
