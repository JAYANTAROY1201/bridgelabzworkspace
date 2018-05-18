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
//_____________________________________________________________________________
	
	
	
	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static String readString() {
		String str= sc.next();
		sc.close();
		return str;
	}
	
//_______________________________________________________________________________________
	
	
	
	
	/*
	 * create_1d_array method to create 1d array
	 */
	
	public static int[] createOneDimensionalArray() {
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
	
//_______________________________________________________________________________
	
	
	
	/*
	*  create_2d_array method to generate a 2d array 
	*/ 

	public static int[][] createTwodArray() 
	{
		int row,col;
		System.out.println("Enter no of rows:");
		row=Utility.readInteger();
		System.out.println("Enter no of columns:");
		col=Utility.readInteger();
		
		int[][]a=new int[row][col];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter value for a["+i+"]["+j+"] position :");
				a[i][j]=Utility.readInteger();
			}
		}
		return a;
	}
	
//_______________________________________________________________________________

	/*
	*  print_2d_array method to print a 2d array in matrix form
	*/ 

	public static void PrintTwoDimensionArray(int[][] a) 
	{
		System.out.println();
		System.out.println();
		System.out.println("Your array is as below:");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{  
				System.out.print(a[i][j]+"  ");
	
			}
			System.out.println();
			System.out.println();
		}
	}
	
//__________________________________________________________________________________
	
	
	/*
	 * replaceUserName method to replace a template with given user name
	 */
	public static String replaceUserName(String user)
	{   
		String template="Hello <<UserName>>, How are you?";
        String out="";
		
		if(user.length()>3)
		{	
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
	
//___________________________________________________________________________________-	
	

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
	
//______________________________________________________________________________
	
	
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
//______________________________________________________________________________________
	 

/*
* find_PowerOfTwo method to print table of 2's power
*/
 
	 
	 public static void findPowerOfTwo(int num) {
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


//_______________________________________________________________________________
	 
	 
	 
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

	
//____________________________________________________________________________	 
	 
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
	
//______________________________________________________________________________	 
	 
	 /*
	 * playGambler method to find win and loss percentage of a gambler game
     */
	 
	 public void playGambler(int stake,int goal,int noOfGame) {
		 
		 int win=0,loss=0,percentWin,percentLoss;
		   
		    
		   for(int i=0;i< noOfGame; i++) {
			  
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
//____________________________________________________________________________________
	 
	 
	 
	 /*
	* coupon_generator method to find how many random numbers are needed to generate a coupon
	 */
	 public void generatorCouponCode(int lengthOfCoupon)
	 {
		 
		 int count=0;
         int code;
		 ArrayList<Integer> coupon= new ArrayList<Integer>();
		 
		 Random r=new Random();
		 do
		 {
			 code=r.nextInt();
			 count++;
			 if(!coupon.contains(code)) 
				{
				   coupon.add(code);
				}
			 
		 }
		 while(coupon.size()<lengthOfCoupon);
		 
		
			System.out.println("You need total "+count+" random numbers to generate this coupon");		
	 
	 
	 for(Integer i:coupon) {
		 System.out.println("coupon code"+i);
	 }
	 }
	 
//_________________________________________________________________________________
	 
	 
	 
	 /*
	*  sum_of_num method to find when the summation gives zero
	 */ 
	 
	 public void sumOfNum(int[]a){
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
//_____________________________________________________________________________________________________
	
	 
	/*
	*  euclidean_distance method to find distance between two points
    */ 
	 
	 public void CalculateEuclieanDistance(double x, double y)
	 {
	 	double result;
	 	result= Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
	 	
	 	System.out.println("Euclidean distance from ("+x+" , "+y+") to origin(0,0) is "+result+" unit(s)");
	 }
	 
//_______________________________________________________________________________________________________________________________________
	 
	 
	/*
    *  findingRoots method to find roots of a quadratic 
    */ 
	 public void findingRoots(int a, int b,int c) 
		{
			int delta;
			double root_1_of_x, root_2_of_x;
			
			System.out.println();
			System.out.println("your equation is: "+a+"*x^2 + "+b+"*x + ("+c+")");
			System.out.println();

			delta= ((b*b)-(4*a*c));
			root_1_of_x=(((0-b)+Math.sqrt(delta))/(2*a));
			root_2_of_x=(((0-b)-Math.sqrt(delta))/(2*a));
			//System.out.println(Math.sqrt(delta));

			System.out.println("First root of x is:"+root_1_of_x);
			System.out.println("Second root of x is:"+root_2_of_x);

		}
	 
//_________________________________________________________________________________________________________________________________________________

	 
 /*
 *  calculateEffectiveTemp method to find effective temperature of wind mill 
 */
	 
	 public static void calculateEffectiveTemp(int t, int v) 
	 {
	 	double w;
	 	
	 	if(t>50 || v>120 || v<3)
	 	{
	 		System.out.println("Out of Range");
	
	 	}
	 	else
	 	{
	 		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
 			System.out.println("Effective temperature for wind mill: "+w );
	 	}
	 }
//________________________________________________________________________________

 /*
  *  calculateEffectiveTemp method to find effective temperature of wind mill 
  */
	 
	 public void measureTime() 
	 {
	 	int choice,temp=0;
	 	long startTime =0,endTime=0;
	 	System.out.println("Press 1 to start your stopwatch");
	 	choice=readInteger();
	      
	      while(temp==0)
	      {
	          switch(choice) 
	          {
	              case 1 : startTime= System.nanoTime(); // Get the current system time in nano second.
	                       System.out.println("Press 0 to stop the Stopwatch");
	                       choice=readInteger();
	                       break;
	                       
	              case 0 : endTime= System.nanoTime();   // Get the current system time in nano second.
	                       temp=1;
	                       break;
	          }
	      }
	      System.out.println("Starting time is : "+startTime+ " ns");
	      System.out.println("Ending time is : "+endTime+" ns");
	      System.out.println("Elapsed Time is : "+ (endTime - startTime)+" ns");
	 }
//________________________________________________________________________________________________________________________________________
	
	 /*
	  *  StringPermutation method to find all permutation of a given string 
	  */	 
	 
	 
public static void StringPermutation(String inputString)
	    {
	        StringPermutation("", inputString);
	    }
	     
private static void StringPermutation(String permute, String inputString)
	    {    
	        if(inputString.length() == 0)
	        {
	            System.out.println(permute);
	        }
	        else
	        {
	            for (int i = 0; i < inputString.length(); i++)
	            {    
	                StringPermutation(permute+inputString.charAt(i), inputString.substring(0, i)+inputString.substring(i+1, inputString.length()));
	            }
	        }
	    }


}
