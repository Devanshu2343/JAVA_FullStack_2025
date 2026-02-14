package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int id;
	
	Student (){
		
	}
	
	Student (String name , int id ){
		this.name = name ;
		this.id = id;
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s1 = new Student ("Dev" , 1) ;
		
		File f5 = new File("/Users/devanshu/Desktop/IO/Student1.ser");
		try {
			f5.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//serialization
		FileOutputStream foo = new FileOutputStream(f5);
		ObjectOutputStream out = new ObjectOutputStream(foo);
		out.writeObject(s1);
		out.close();
		
		//desrialization
		FileInputStream fio = new FileInputStream(f5);
		ObjectInputStream in = new ObjectInputStream(fio);
		Student s = (Student)in.readObject();
		
		System.out.println(s.name);
		System.out.println(s.id);
		

	}

}
