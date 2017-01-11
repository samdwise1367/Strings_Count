/*
Write a program that accepts an array of non negative integers and returns the second highest
number in that array without using any class from java.util

/**
 *
 * @author samdwise
 */
public class ExerciseSecndHigherst {
    public static int secondHighestArray(int[] arrayParament)
    {
                      
	int temp;         
        //use bubblue sort to sort into ascending order
   	 for ( int i = 0 ; i < arrayParament.length-1 ; i++ )
   	 {
             //for(int j = 0; j)
   	    if ( arrayParament[i] > arrayParament[i+1] )
   	    {
                temp = arrayParament[i];
                arrayParament[i] = arrayParament[i+1];
                arrayParament[i+1] = temp;
   	    }
   	 }
         return arrayParament[(arrayParament.length)-2]; //returns the second highest value in the array
      }
    
    public static void main(String [] args){
        //test the method
        int [] getArray = {3,6,7,10,2,9,100,21,4,78};
        System.out.println("The second highest of the array is "+secondHighestArray(getArray));
    }
  }
    
    

