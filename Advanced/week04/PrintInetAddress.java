package week04;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println(InetAddress.getLocalHost().getHostAddress());
		System.out.println(InetAddress.getLocalHost().getHostName());
				
	}
}

