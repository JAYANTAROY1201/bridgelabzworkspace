package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc=new Scanner(System.in);
	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static int readInteger() {
		int number= sc.nextInt();
		//sc.close();
        return number;
	}
	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static String readString() {
		String str= sc.next();
		sc.close();
		return str;
	}
	/*
	 * create_1d_array method to create 1d array
	 */
	
	public static int[] create_1d_array() {
		int size;
		System.out.println("Enter size of array");
		 size=readInteger();
		 int [] a= new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("Enter value for a["+i+"]  :");
			 a[i]=readInteger();
	}
		 return a;
	}
	
	/*
	 * replaceUserName method to replace a template with given user name
	 */
	public static String replaceUserName(String user)
	{   
		String template="Hello <<UserName>>, How are you?";
        String out="";
		
		
		
		if(user.length()>3) {	
		
		
			String[] temp=template.split(" ");
			for(int i=0;i<temp.length;i++)
			{
				if(temp[i].equals("<<UserName>>,"))
				{
					temp[i]=user+",";
				}
			}
			for(int i=0;i<temp.length;i++)
			{
				out=out+temp[i]+" ";
			}
	    }
		return out;
	}
	
	
	

	/*
	 * findFlipPercent method to finding the percent of head and tail
	 */
	
	public static void findFlipPercent(int no_of_flip) {
		
		 int head=0, tail=0,headPercent, tailPercent;
		 
		 for (int i = 0; i < no_of_flip; i++) {
		     if(Math.random()<0.5) {
		    	 tail++;
		     }
		     else {
		    	 head++;
		     }
			
		  }
		 headPercent=(head*100)/no_of_flip;
		 tailPercent=(tail*100)/no_of_flip;
		  
		  System.out.println("Head percentage is :"+ headPercent);
		  System.out.println("Tail percentage is :"+ tailPercent);	
		}
	

	
	/*
	 * checkLeapYear method to find a year is leap year or not
	 */
	
	 public static void checkLeapYear(int year){
		 
		String LEAP_YEAR= " is a Leap Year";
		String NOT_LEAP_YEAR= " is not a Leap Year";
	     
	    
	    if(year<1582){
	       System.out.println("Invalid year");}
	    else{ 
	       if((year%100==0 && year%400==0)||(year%100 !=0 && year%4==0)){
	          System.out.println(year+LEAP_YEAR);
	       }
	       else{
	          System.out.println(year+NOT_LEAP_YEAR);
	      }     
	   }
	 }
	 

/*
* find_PowerOfTwo method to print table of 2's power
*/
 
	 
	 public static void find_PowerOfTwo(int num) {
		   int mOutput=1;
		   for (int i = 1; i <= num; i++) {
		      mOutput=mOutput*2;
			  System.out.println("2 ^ "+i+" = "+mOutput);
		   }
		   if(num==0)
		   {  
			   mOutput=1;
			  System.out.println("2 ^ 0 = "+mOutput);
		   }
		}


	 
	 /*
	 * findHarmonic method to print nth harmonic progression
	 */
	 public void findHarmonic(int num) {
		 
		
		double out=0.0;	
		while(num>0) {
			out=out+(double)1/num;
			num--;
		}
			
		System.out.println("your result is:"+ out);
		}

	
	 
	 
	 /*
	 * findPrimeFactor method to find the prime factors of a given number
	 */ 
	 public void findPrimeFactor(int num) 
	 {
		 
		    int temp;
			temp=num;
			
			ArrayList<Integer> factor = new ArrayList<Integer>();
			for (int i = 2; i*i <= num; i++) 
			{
			    while (num % i == 0)
			    {
			        factor.add(i);
			        num = num/i;
			    }
			}
			
			if (num > 1) 
			{
				factor.add(num);
			}
			System.out.println("Prime factor(s) of "+temp+":");
			for(Integer i:factor) 
			{
				System.out.print(i+" ");
			}
	}
	
	 
	 
	 /*
	 * playGambler method to find win and loss percentage of a gambler game
     */
	 
	 public void playGambler(int stake,int goal,int no_of_game) {
		 
		 int win=0,loss=0,percentWin,percentLoss;
		   
		    
		   for(int i=0;i< no_of_game; i++) {
			  
				   if(Math.random()<0.5) {
					   stake++;
					   win++;
					   if(stake==goal || stake==0) {
						   break;
			               }
				   }
				   else {
					  stake--;
					  loss++;
					  if(stake==goal || stake==0) {
						   break;
				      }
				   
				      }
			        }//end of inner loop
			  
		   //end of outer loop
		   percentWin=(win*100)/(win+loss);
		   percentLoss=(loss*100)/(win+loss);
		   
		   System.out.println("No. of winning:"+win);
		   System.out.println("Percentage. of winning:"+percentWin);
		   System.out.println("Percentage of loss:"+percentLoss);

		   }
	 
	 
	 /*
	* coupon_generator method to find how many random numbers are needed to generate a coupon
	 */
	 public void coupon_generator(int length_of_coupon)
	 {
		 
		 int code,codes,count=0;;
         
		 ArrayList<Integer> coupon= new ArrayList<Integer>();
		 System.out.println("Enter distinct coupon codes:");
		 
		 for(int j=0;coupon.size()<length_of_coupon; j++)
		 {
		    code= readInteger();
			if(!coupon.contains(code)) 
			{
			   coupon.add(code);
			}
		 }
			
		    Random rand = new Random();

			for(int i=0;i<coupon.size();i++) 
			{
				 codes=coupon.get(i);
				 while(codes!= rand.nextInt(10))
				 {
				   count++;
				 }	
			}
			System.out.println("You need total "+count+" random numbers to generate this coupon");		
	 }
	 
	 
	 /*
	*  sum_of_num method to find when the summation gives zero
	 */ 
	 
	 public void sum_of_num(int[]a){
		 int count=0;
		 
		 
		 for(int j=0;j<a.length;j++) 
		 {
			for(int k=j+1;k<a.length;k++) 
				{
				   for(int l=k+1;l<a.length;l++)
					 {
						if(a[j]+a[k]+a[l]==0) 
						{
							count++;
							System.out.println("Sum of "+a[j]+","+a[k]+" & "+a[l]+" is 0");
						}
					 }
				}
		 }
		 System.out.println("Total "+count+" triplets found");	 	 
	  }
	
}