package Networks;

import java.net.URL;

public class URLClass {
public static void main(String []a) {
	try {
		URL u=new URL("http://localhost:80/test.php");
System.out.println("protocol:"+u.getProtocol());
System.out.println("Host:"+u.getHost());
System.out.println("port:"+u.getPort());
System.out.println("file:"+u.getFile());
System.out.println("path:"+u.toExternalForm());
	
	}catch(Exception e) {e.printStackTrace();	}
	
}
}
