package com.wso2.TCP.Client;

import java.util.*;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Socket s = new Socket("localhost", 8888);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
            System.out.println("Client is started " + " at  " + new Date() + '\n');
            System.out.println("Response from server");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

