package com.spotpush.netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

public class NetworkApplication {

    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 10430;
        
        ServerSocket server = new ServerSocket(port,50,
                InetAddress.getByName(host));
        System.out.println("Server started @ "+host+" on port: "+port);
        Socket client = new Socket(host,port);
        System.out.println("Connecting to Server...");
        Socket connection = server.accept();
        System.out.println("Connection to server established");
        
        DataOutputStream clientOut = new DataOutputStream(client.getOutputStream());
        DataInputStream clientIn = new DataInputStream(client.getInputStream());
        DataOutputStream serverOut = new DataOutputStream(connection.getOutputStream());
        DataInputStream serverIn = new DataInputStream(connection.getInputStream());
        
        System.out.println("Communiction Ready");
        
        byte[] messageOut = "Welcome to Earth".getBytes();
        clientOut.writeInt(messageOut.length);
        clientOut.write(messageOut);
        clientOut.flush();
        System.out.println("Message sent to server: "+new String(messageOut));
    
        int length = serverIn.readInt();
        if (length > 0) {
            byte[] messageIn =new byte[length];
            serverIn.readFully(messageIn,0,messageIn.length);
            System.out.println("Message received from client: "+new String(messageIn));
        }
        clientOut.close();
        serverOut.close();
        System.out.println("Connections closed.");
        server.close();
        System.out.println("Server terminated.");
        
    }
}
