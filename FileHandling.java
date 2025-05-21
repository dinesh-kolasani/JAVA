import java.io.*; 

public class FileHandling {
	public static void main (String[] args) throws Exception{
		
		File f = new File("Dinesh.txt");
		f.createNewFile(); // Creating file

		FileWriter fw = new FileWriter(f.getName());
		fw.write("Dinesh \nraj, \ntext \nsuccessfully \nadded"); // Writing file
		fw.flush(); // Sending data forcefully to file
		fw.close(); // Closing file

		FileReader fr = new FileReader(f.getName());
		BufferedReader br = new BufferedReader(fr);
		String fileData;
		
		while((fileData = br.readLine()) != null){ // Reading file
			System.out.print(fileData);
		}


		f.delete(); // Deleting file	
		
	}
}