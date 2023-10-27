package com.bruce.nettylearn.nio;

import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception{
        String host = "127.0.0.1";
        int port = 8999;
        // 创建一个socket客户端连接，并维持连接
        Socket socket = new Socket(host, port);
        // 休眠 1s，保证连接建立成功
        Thread.sleep(2000);
        // 发送请求
        socket.getOutputStream().write("Hello Server".getBytes());
        //socket.getOutputStream().flush();
        System.out.println("向服务端发送了请求： Hello Server");
        // 接收响应
        byte[] bytes = new byte[1024];
        int len = socket.getInputStream().read(bytes);
        System.out.println("接收到服务端的响应： " + new String(bytes, 0, len));
        // 关闭连接
        socket.close();
    }
}
