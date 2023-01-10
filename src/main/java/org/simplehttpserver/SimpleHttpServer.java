package org.simplehttpserver;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Hello world!
 */
public class SimpleHttpServer {

    private HttpServer httpServer;
    private int port;


    private void start(int port) {
        this.port = port;
        try {
            httpServer = HttpServer.create(new InetSocketAddress(port), 0);
            System.out.println("server started at port " + port);
            httpServer.setExecutor(null);
            httpServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final int DEFAULT_PORT = 8080;
        SimpleHttpServer simpleHttpServer = new SimpleHttpServer();
        simpleHttpServer.start(DEFAULT_PORT);
    }
}
