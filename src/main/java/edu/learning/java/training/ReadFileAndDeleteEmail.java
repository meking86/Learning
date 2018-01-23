package edu.learning.java.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadFileAndDeleteEmail {

	
	public static void main(String[] args) throws IOException {
		ReadFileAndDeleteEmail readfileOj = new ReadFileAndDeleteEmail();
		
		readfileOj.readFileDeleteObj();
	}

	public void readFileDeleteObj() throws IOException {
		File f = new File("src/main/resource/emailId.txt");
		BufferedReader reader = null;
		String line = "";
		FileWriter fw = new FileWriter("src/main/resource/emailId_edited.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		List<String> list = new LinkedList();
		try{
			reader = new BufferedReader(new FileReader(f));
			while((line=reader.readLine()) !=null){
				for(String each : line.split(",")){
					list.add(each);
				}
			}
			for(String lis : list){
				System.out.println(lis);
			}
			Scanner sc = new Scanner(System.in);
			list.remove(sc.nextLine());
			
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				String temp = it.next();
				if(it.hasNext())
				bw.write(temp+",");
				else
					bw.write(temp);
			}
//			for(String lis : list){
//				System.out.println(lis);
//				bw.write(lis+",");
//				
//			}
			bw.close();
			fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
