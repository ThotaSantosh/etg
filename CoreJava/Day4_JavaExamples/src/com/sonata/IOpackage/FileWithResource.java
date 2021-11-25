package com.sonata.IOpackage;
import java.io.*;
public class FileWithResource {
public static void main() throws FileNotFoundException, IOException {
	try(BufferedReader br= new BufferedReader(new FileReader("D:\\test.txt"))){
		System.out.println(br.readLine());
	}
catch(IOException e) {
	e.printStackTrace();
}
}
}
