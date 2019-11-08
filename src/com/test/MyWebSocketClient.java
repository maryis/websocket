package com.test;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by ispareh.m on 5/5/2019.
 */
@ClientEndpoint
public class MyWebSocketClient {

    Session session;

    public MyWebSocketClient(URI uri) {
        WebSocketContainer container= ContainerProvider.getWebSocketContainer();
        try {
            container.connectToServer(this, uri);
        } catch (DeploymentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.session = session;
    }

    @OnOpen
    public  void onOpen(Session s)
    {
        session=s;
        System.out.println(s.getId()+" is open");

    }

    @OnClose
    public  void onClose(Session s)
    {
        System.out.println(s.getId()+" is close");
    }

    @OnError
    public  void onError(Throwable t)
    {
        System.out.println(t.getMessage());
    }

    @OnMessage
    public  void onMes(String msg, Session s) {
        System.out.println(s.getId() + " is open, the server response :" + msg);

    }

}
