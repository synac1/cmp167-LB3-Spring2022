/**
 * 
 * @author Yanilda
 * @description: 3.2 & 3.3.3
 */
import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;


public class Program4 {
	public static void main(String[] args) {
		double n = 7.1;
		System.out.printf("total is: %.3f%n", n); //Using printf
		
		String sentence = String.format("Ok, your total is: %06.3f  ", n);//Using format
		
		System.out.println(sentence);
		
		// 3.3.3 StringWriter and PrintWriter
		int age = 40;
		
		StringWriter sw = new StringWriter();
		PrintWriter  pw = new PrintWriter(sw);
		
		pw.println("Marie is "+age+", she also likes to bike" );// printing to the StringWriter
		pw.println("John is "+age+", he likes to cook" );
		
		
		String s = sw.toString();		
		System.out.print(s);
		
		
	}
}
