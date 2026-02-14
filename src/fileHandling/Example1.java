package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create folder
		File folder  = new File("/Users/devanshu/Desktop/IO");
		folder.mkdir();
		
		//create file
		File f1 = new File(folder,"Student.txt");
		try {
			f1.createNewFile();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		File f2  = new File(folder , "Emp.txt") ;
		
		try {
			f2.createNewFile();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		if(folder.exists()) {
			File[] list = folder.listFiles();
			for(int i =0 ; i <list.length ;i++) {
				System.out.println(list[i].getName());
			}
		}
		
		//write data in file
		FileWriter writer = new FileWriter(f1);
		writer.write("Hello Students") ;
		writer.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write("Student Count : 40 b ");
		
		bw.newLine();
		bw.write("Have a nice day \n" + "Hello From ");
		
		bw.close();
//		
//		//read data from file
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String line ;
		
		while((line = br.readLine() )!= null) {
			System.out.println(line);
		}
//		br.read();
		br.close();
//		

	}

}























