import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class bitResults {


	public static void main(String[] args) throws IOException {
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PLEASE ENTER THE NUMBER OF STUDENTS"); 
        int size = sc.nextInt();
        System.out.println("");
        
        String[] student = new String[size]; 
        for(int counter = 0; counter < size; counter++){
        System.out.println("ENTER STUDENT NAME");
        student[counter] = sc.next();
        }
        System.out.println("");
        
        int[] assignment1 = new int[size];
        for(int counter = 0; counter < size; counter++){
        System.out.println("PLEASE ENTER MARKS FOR ASSIGNMENT ONE(1)");
        assignment1[counter] = sc.nextInt();
        }
        System.out.println("");
        
        int[] assignment2 = new int[size];
        for(int counter = 0; counter < size; counter++){
        System.out.println("PLEASE ENTER MARKS FOR ASSIGNMENT 2");
        assignment2[counter] = sc.nextInt();
        }
        System.out.println("");
        
        int[] test1 = new int[size];
        for(int counter = 0; counter < size; counter++){
        System.out.println("PLEASE ENTER MARKS FOR TEST 1");
        test1[counter] = sc.nextInt();
        }
        System.out.println("");
        
        int[] test2 = new int[size];
        for(int counter = 0; counter < size; counter++){
        System.out.println("PLEASE ENTER MARKS FOR TEST 2");
        test2[counter] = sc.nextInt();
        }
        System.out.println("");
        
        int[] avarageAss;
        int []avarageTest;
        
       
        
        String fileName = "BIT231.txt";
        try {
        	
        
        System.out.println ();
        
        PrintWriter outputStream = new PrintWriter(fileName);
        for(int counter = 0; counter < size; counter++){
        outputStream.println (student[counter] + "\t" +  assignment2[counter] + "\t" +  assignment1[counter] +"\t" + test2[counter] + "\t" + test1[counter]+"\t");   
        }
        outputStream.close(); 
        
        }catch (FileNotFoundException e) {
        	e.printStackTrace();
        }
               System.out.println("student" + "\t" + "assignment1" + "\t" + "assignment2" + "\t" +"test1"+ "\t" + "test2" +"\t");
        for(int counter = 0; counter < size; counter++){
        System.out.println (student[counter] + "\t" +  assignment2[counter] + "\t" +  assignment1[counter] +"\t" + test2[counter] + "\t" + test1[counter]+"\t");
        
        }
		
	}

}