package com.wso2.TCP.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientThread extends Thread {
    private Socket connection;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;

    public void run() {
        try {
            dataInputStream = new DataInputStream(this.connection.getInputStream());
            dataOutputStream = new DataOutputStream(this.connection.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Client is reached");
            this.dataOutputStream.writeChars("Name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ClientThread(Socket connection) {

        this.connection = connection;
    }
}
