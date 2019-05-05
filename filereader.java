package Project;


import java.io.*;
import java.util.*;


public class filereader {

	public static void main(String args[]) throws Exception
	{
	
		FileReader fr=new FileReader("personalINfo.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		int linecount=0;
		String line;
		String words[]=new String[500];
		while ((s=br.readLine())!=null)
		{
			linecount++;
			int indexfound=s.indexOf("34");
			if (indexfound=='\0')
			{
				System.out.println("\n");
				System.out.println("personal data related student found");
				line=s;
				System.out.println(line);
			}
		}
		fr.close();
		
		
		
		FileReader fr1=new FileReader("academicINfo.txt");
		BufferedReader br1=new BufferedReader(fr1);
		String s1;
		int linecount1=0;
		String line1;
		String words1[]=new String[500];
		while ((s1=br1.readLine())!=null)
		{
			linecount1++;
			int indexfound1=s1.indexOf("0934");
			if (indexfound1=='\0')
			{
				System.out.println("academic data related student found");
				line1=s1;
				System.out.println(line1);
			}
		}
		fr1.close();
	}

}
