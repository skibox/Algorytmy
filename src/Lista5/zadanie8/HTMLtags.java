package Lista5.zadanie8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLtags {
	public static void main(String[] args) {

		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		BufferedReader bReader = null;
		String contentLineIn;
		
		StringBuilder contentLineOut = new StringBuilder();
		
		try {

			File file = new File("bin/fileOut.txt");
			bReader = new BufferedReader(new FileReader("bin/file1.txt"));
			fWriter = new FileWriter(file,true);
			bWriter = new BufferedWriter(fWriter);
			
			
				contentLineIn = bReader.readLine();
				
				while (contentLineIn != null) {
					
				char[] temp = new char[contentLineIn.length()];
				temp = contentLineIn.toCharArray();
				
						for (int i = 0; i < temp.length; i++) {

							int counter = i;
							
							if(temp[i] == '<') {
								while(temp[counter] != '>') {
									temp[counter] = Character.toUpperCase(temp[counter]);
									counter++;
								}
							}
							contentLineOut.append(temp[i]);
						}
						contentLineOut.append("\n");	
						contentLineIn = bReader.readLine();
			} 
			
			System.out.println(contentLineOut.toString());
			bWriter.write(contentLineOut.toString());
			bWriter.flush();
			bWriter.close();
			
		} catch (IOException ioe) {
			System.out.println("MARUDZI");
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
