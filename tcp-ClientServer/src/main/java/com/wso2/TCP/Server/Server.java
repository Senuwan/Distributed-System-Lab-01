package com.wso2.TCP.Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.*;

public class Server {

    static ExecutorService executor;
    Socket st;

    Server(Socket st) {
        this.st = st;
    }

    public static void main(String args[]) throws Exception {
        int client = 0;
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(100);
        executor = new ThreadPoolExecutor(10, 20, 1000, TimeUnit.MILLISECONDS, blockingQueue);
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("Server started time: " + new Date() + '\n');


        while (true) {

            Socket sock = ss.accept();
            client++;
            System.out.println(client + "  Client connected: " + "at " + new Date() + '\n');
            executor.execute(new ClientThread(sock));
        }
    }

}