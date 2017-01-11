/*
Write a program that takes a String and returns a sorted (ascending order) array of numbers in that
String and an empty array if the string contains no numbers, without using any class from java.util
 */

/**
 *
 * @author samdwise
 */
public class ExerciseStringSort2 {
    public static int [] sortString(String wordMix){
        char [] getChar = new char[wordMix.length()];
        char [] getNumber = {'0','1','2','3','4','5','6','7','8','9'};
        
        
        //for loop to bring string into char and store into an array
        for(int i =0; i< wordMix.length(); i++){
             getChar[i] = wordMix.charAt(i);
        }
        
        int count = 0;
        //for loop to count how many numbers are in the string
        for(int i = 0; i< getChar.length; i++){
             for(int j = 0; j < getNumber.length; j++){
             if(getChar[i] == getNumber[j]){
                 count++;
                }
             }
        }
            char [] getNO = new char[count];
            int temp = 0;
            for(int i = 0; i< getChar.length; i++){
                for(int j = 0; j < getNumber.length; j++){
                if(getChar[i] == getNumber[j]){
                 //count++;
                    getNO[temp] = getNumber[j];
                    temp++;
             }
                if(count == temp){
                    break;
                }
             }
        }
            //converting char to int
            int [] numberInt = new int [getNO.length];
            for(int i = 0; i< numberInt.length; i++){
                numberInt[i] = getNO[i]-'0';
                //System.out.println(numberInt[i]);
            }
            
    return numberInt;
    }
    
    public static void sArray(int[] arrayParament)
    {                 
	int temp = 0;         
        //use bubblue sort to sort into ascending order
   	 for ( int i = 0 ; i < arrayParament.length-1 ; i++ )
   	 {
             //for(int j = 0; j)
   	    if ( arrayParament[i] < arrayParament[i+1] )
   	    {
                temp = arrayParament[i];
                arrayParament[i] = arrayParament[i+1];
                arrayParament[i+1] = temp;
   	    }
   	 }
         
         
        for ( int i = 0 ; i < arrayParament.length ; i++ ){
            System.out.println(arrayParament[i]);
        }
     }
    public static void main(String [] args){
       
       sArray(sortString("s6664a5m55sn1s3d4"));
}
}
