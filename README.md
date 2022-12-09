# websocket
java websocket (client and server)
WebSocket is a technology for establishing a persistent, low-latency, full-duplex communication channel over a single http connection
 for real-time data exchange between a server endpoint (Java, .NET, PHP etc.) and a client (HTML5 / JavaScript, iOS).

# socket vs websocket 
WebSockets communicate over a TCP (Transmission Control Protocol) connection and they use sockets in their implementation.
Even though they achieve (in general) similar things, yes, they are really different. WebSockets typically run from browsers 
connecting to Application Server over a protocol similar to HTTP that runs over TCP/IP. So they are primarily for Web Applications 
that require a permanent connection to its server. On the other hand, plain sockets are more powerful and generic.
 They run over TCP/IP but they are not restricted to browsers or HTTP protocol. They could be used to implement any kind of communication.

# this project
the project contains 3 codeFiles:
main, myWebSocketClient should run on one machine as a client(in this project they come in test section as an integration test)
MyWebSocketServer should run on another machine and on Application Server such as tomcat
to run code: run tomcat and then run test Client

the general format of code in server and client does not differ.
in real cases the client should be written in JS. 

the concept is clear:
defining what should happen on 
open
close
error
message
in a session.
and to send message:
session.getBasicRemote().sendText("hi server");


