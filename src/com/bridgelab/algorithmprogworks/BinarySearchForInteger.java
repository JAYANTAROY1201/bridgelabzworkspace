package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;


class BinarySearchForInteger
{
  //main method implementation of recursive Binary Search
   public static void main(String args[])
   {
    
     int a[] = Utility.createOneDimensionalIntArray() ;
     int start=0;
     int end = a.length-1;
     System.out.println("Enter your search element: ");
     int search= Utility.readInteger();
     a=Utility.bubbleSortForInt(a);
     Utility.binarySearchForInteger(a,start,end,search);
    
 }
}
