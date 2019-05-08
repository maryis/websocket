package com.nioc;

import javax.websocket.ContainerProvider;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;

public class Main {

    public static void main(String[] args) {

        System.out.print("sdfsd");
        MyWebSocketClient client=new MyWebSocketClient(URI.create("ws://localhost:8081/endpoint"));


    }
}

