package com.molini;
import java.io.Serializable;
import java.util.function.Consumer;

public class Server extends NetworkConnection {
private int port;

 public Server( int port, Consumer<Serializable> onReceiveCallBack) {
super(onReceiveCallBack);
this.port = port;

}



@Override
protected boolean isServer() {
// TODO Auto-generated method stub
return true;
}

@Override
protected String getIP() {
// TODO Auto-generated method stub
return null;
}

@Override
protected int getPort() {
// TODO Auto-generated method stub
return port;
}

}