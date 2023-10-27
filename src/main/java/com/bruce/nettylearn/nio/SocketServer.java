package com.bruce.nettylearn.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws Exception {
        while(true){
            ServerSocket serverSocket = new ServerSocket(8999);
            Socket socket = serverSocket.accept();
            System.out.println("接收到客户端的连接： " + socket.toString() + "\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            String request;
            String response;
            while ((request = bufferedReader.readLine()) != null) {
                if ("Done".equals(request)) {
                    break;
                }
                System.out.println("收到客户端的请求： " + request  + "\n");
                response = processRequest(request);
                printWriter.println(response);
            }}
    }

    private static String processRequest(String request) {
        return "接收到了客户端的请求： " + request + "\n";
    }
}
