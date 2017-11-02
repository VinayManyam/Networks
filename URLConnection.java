package Networks;

import java.io.File;
import java.net.URL;

public class URLConnection {
public static void main(String []a) {
	try {
		int c;
		File file=new File("Example.txt");
		String filePath="file:///"+file.getAbsolutePath();
		URL fileURL=new URL(filePath);
		Object ucon=fileURL.openConnection();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
