import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s = sc.next();
		    //to count the 1
		    int count1=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i) == '1'){
		            count1++;
		        }
		    }
		    //to count the largest substring of the 0
		    int count2=0;
		    int max =0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i) == '0'){
		            count2++;
		        }
		        else{
		            max = Math.max(max,count2);
		            count2=0; //here the count2 is made zero so that if any break in the sequence it most start from 0;
		            
		        }
		    }
		    max = Math.max(max,count2);//here we are taking the final max of count2 and else max,
		    System.out.println(count1+max); //adding the count of 1 and 0.
		}

	}
}
