package serialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Myreadfile {

	public static void main(String[] args) {
		try {
			File myfile = new File("/Users/nashitahzainab/Desktop/mytextfile.txt");
			File outfile = new File("/Users/nashitahzainab/Desktop/mytextfile_copy.txt");
			FileReader filereader = new FileReader(myfile);
			FileWriter filewriter = new FileWriter(outfile);
			BufferedReader reader = new BufferedReader(filereader);
			BufferedWriter writer = new BufferedWriter(filewriter);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line);
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
