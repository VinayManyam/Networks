package Networks;

import java.io.File;
import java.net.URL;

import org.omg.CORBA.portable.InputStream;

public class FIleUrlClass {
public static void main(String []a) {
	try {
		File file=new File("URLClass.java");
		String filePath="file:///"+file.getAbsolutePath();
		URL fileURL=new URL(filePath);
		java.io.InputStream in=fileURL.openStream();
		
		int data;
		while((data=in.read())!=-1) {
			System.out.print((char)data);
		}
		
	}catch(Exception e) {e.printStackTrace();}
}
}
