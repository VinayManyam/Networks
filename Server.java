package Networks;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String []a) {
	try {
		ServerSocket ss=new ServerSocket(4444);
		System.out.println("server is running...");
		Socket s=ss.accept();
		System.out.println("connectuon is accepted");
		System.out.println("sending a msg to client...");
		OutputStream o=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(o);
		dos.writeBytes("Hello this is the msg...");
		dos.close();
		s.close();
		ss.close();
	}catch(Exception e) {e.printStackTrace();}
}
}
