package com.nioc;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * Created by ispareh.m on 5/5/2019.
 */

@ServerEndpoint("/endpoint")
public class MyWebSocketServer {

    @OnOpen
    public  void onOpen(Session s)
    {
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
    public  void onMes(String msg, Session s)
    {
        System.out.println(s.getId()+" is open, the msg:"+msg);
        try {
            s.getBasicRemote().sendText("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
