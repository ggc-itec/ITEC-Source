package week04;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatServer {

	// Toy ChatServer to illustrate multi-threading
	
	private final int port = 7777;
	private ServerSocket serverSocket;
	private ArrayList<Socket> clientList;	

	public ChatServer() {
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.setReuseAddress(true);
		} catch (IOException e)
		{
			System.out.println(e.getStackTrace());
		}
		clientList = new ArrayList<Socket>();
	}

	public void startServer() throws IOException {
		System.out.println("Accepting clients...");
		while(true)
		{
			// wait for a client
			Socket client = serverSocket.accept();
			clientList.add(client);
			System.out.println("New client accepted..." + client.getRemoteSocketAddress());
			System.out.println("Total users: " + clientList.size());
			ChatClientHandler handler = new ChatClientHandler(client,this);
			Thread t = new Thread(handler);
			t.start();
		}
	}
	
	public synchronized void sendChatMessageToAll(String msg) throws IOException {
		for(Iterator<Socket> it=clientList.iterator(); it.hasNext();)
		{
			Socket client = it.next();
			if( !client.isClosed() )
			{
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				pw.println(msg);
				pw.flush();
				//System.out.println("Sent to: " + client.getRemoteSocketAddress());
			}
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new ChatServer().startServer();
	}

}
