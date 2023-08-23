package ComplieTimeExceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptions {
	public static void main(String[] args) throws IOException {
		try {
			File f=new File("C:\\class\\suri.txt");
			try (FileReader fr = new FileReader(f)) {
				int temp=0;
				while((temp=fr.read())!=-1) {
					System.out.print((char)(temp));
				}
			}
		}
		catch(IOException io) {
			System.out.println(io);
		}
		
	}
}
