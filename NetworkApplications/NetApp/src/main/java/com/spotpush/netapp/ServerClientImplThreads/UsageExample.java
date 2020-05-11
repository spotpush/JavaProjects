package com.spotpush.netapp.ServerClientImplThreads;
/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

/**
 * The class {@code UsageExample} shows the usage of {@link Server} and {@link Client}. This examples uses
 * {@link Thread#sleep(long)} to ensure every segment is executed because quickly starting and closing causes some
 * segments to not execute.
 *
 * @version 1.0
 * @see Server
 * @see Client
 */
public class UsageExample {
    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 10430;

        Server server = new Server(host, port);
        Client client = new Client(host, port);
        Thread.sleep(100L);

        client.send("Hello.");
        server.broadcast("Hey, fella!");
        Thread.sleep(100L);

        server.disconnect(server.getConnections()[0]); // or client.close() to disconnect from client-side
        server.close();
    }
}
