package com.test;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;

public class Client {

    @Test
    public void client() {

        System.out.print("starting the client");
        MyWebSocketClient client=new MyWebSocketClient(URI.create("ws://localhost:8082/endpoint"));

        try {
            client.session.getBasicRemote().sendText("hi server");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){}

    }
}

