package Networks;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client {
public static void main(String[] s) {
	System.out.println("clinet program");
	try {
		Socket a=new Socket("localhost",4444);
		InputStream i=a.getInputStream();
		DataInputStream d=new DataInputStream(i);
		
		String st=d.readLine();
		System.out.println("Server msg is:"+st);
		d.close();
		a.close();
		
		
	}catch(Exception e) {e.printStackTrace();}
}
}
