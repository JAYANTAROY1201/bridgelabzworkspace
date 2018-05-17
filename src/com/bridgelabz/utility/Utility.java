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
	 * replaceUserName method to replace a template with given user name
	 */
	public static String replaceUserName()
	{   
		String template="Hello <<UserName>>, How are you?";
        String user="", out="";
		
		System.out.println("enter user name:");
		user=readString();
		
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
	
	public static void findFlipPercent() {
		
		 int mFlip,mHead=0, mTail=0,mHeadPercent, mTailPercent;
		 System.out.println("enter no of time the coin will be flipped:");
		 mFlip = readInteger();  
		 for (int i = 0; i < mFlip; i++) {
		     if(Math.random()<0.5) {
		        mTail++;
		     }
		     else {
		    	mHead++;
		     }
			
		  }
		  mHeadPercent=(mHead*100)/mFlip;
		  mTailPercent=(mTail*100)/mFlip;
		  
		  System.out.println("Head percentage is :"+ mHeadPercent);
		  System.out.println("Tail percentage is :"+ mTailPercent);	
		}
	

	
	/*
	 * checkLeapYear method to find a year is leap year or not
	 */
	
	 public static void checkLeapYear(){
		 
		int year;
		String LEAP_YEAR= " is a Leap Year";
		String NOT_LEAP_YEAR= " is not a Leap Year";
	     
	    System.out.println("Enter year which you want to check :");
	    System.out.println("NOTE: Year must be greater than or equals to 1582");
	    year=readInteger();
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
	 public void findHarmonic() {
		 
		int num;
		double out=0.0;

		System.out.println("Enter your number:");
		num=readInteger();
		  
			
		while(num>0) {
			out=out+(double)1/num;
			num--;
		}
			
		System.out.println("your result is:"+ out);
		}

	
	 
	 
	 /*
	 * findPrimeFactor method to find the prime factors of a given number
	 */ 
	 public void findPrimeFactor() {
		 
		    int num,temp;
			
			System.out.println("Enter you number:");
			num=readInteger();
			temp=num;
			ArrayList<Integer> factor = new ArrayList<Integer>();
			for (int i = 2; i*i <= num; i++) {
			    while (num % i == 0) {
			        factor.add(i);
			        num = num/i;
			    }
			}
			if (num > 1) {
				factor.add(num);
			}
			System.out.println("Prime factor(s) of "+temp+":");
			for(Integer i:factor) {
				System.out.print(i+" ");
			}
		}
	
	 
	 
	 /*
	 * playGambler method to find win and loss percentage of a gambler game
     */
	 
	 public void playGambler() {
		 
		 int stake, goal, no_of_game, win=0,loss=0,percentWin,percentLoss;
		   System.out.println("Enter your stake:");
		   stake=readInteger();
		   System.out.println("Enter your goal:");
		   goal=readInteger();
		   System.out.println("Enter no of times you are going to play:");
		   System.out.println("chances must be equal or greater than:"+(goal-stake+5));
           no_of_game=readInteger();
		    
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
		   percentLoss=(loss*100)/no_of_game;
		   
		   System.out.println("No. of winning:"+win);
		   System.out.println("Percentage. of winning:"+percentWin);
		   System.out.println("Percentage of loss:"+percentLoss);

		   }
	 
	 
	 /*
	* coupon_generator method to find how many random numbers are needed to generate a coupon
	 */
	 public void coupon_generator() {
		 
		 int length_of_coupon,code,codes,count=0;;
         System.out.println("Enter the length of coupon:");
		 length_of_coupon= readInteger();
		 ArrayList<Integer> coupon= new ArrayList<Integer>();
		 System.out.println("Enter distinct coupon codes:");
		 
		 for(int j=0;coupon.size()<length_of_coupon; j++){
		    code= readInteger();
			if(!coupon.contains(code)) {
			   coupon.add(code);
			}
		}
			
		    Random rand = new Random();

			for(int i=0;i<coupon.size();i++) {
				 codes=coupon.get(i);
				 while(codes!= rand.nextInt(10)) {
				 count++;
				}	
			}
			System.out.println("You need total "+count+" random numbers to generate this coupon");		
			}
	 
	 
	 /*
	*  sum_of_num method to find when the summation gives zero
	 */ 
	 
	 public void sum_of_num(){
		 int size,count=0;
		
		 System.out.println("Enter size of array");
		 size=readInteger();
		 int [] a= new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("Enter value for a["+i+"]  :");
			 a[i]=readInteger();
		 }
		 
		 for(int j=0;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					for(int l=k+1;l<a.length;l++) {
						if(a[j]+a[k]+a[l]==0) {
							count++;
							System.out.println("Sum of "+a[j]+","+a[k]+" & "+a[l]+" is 0");
						}
					}
				}
		 }
		 System.out.println("Total "+count+" triplets found");
		 	 
	 }
	
}