/*
Write a program to print the individual words and the total count of these words in a given text
document without using an array or any class from the java.util package.
 */

/**
 *
 * @author samdwise
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class ExerciseFile1 {
    
    private static int numberOfWords = 0;
    public static String read(String filePath) throws FileNotFoundException, IOException{
        String getLine = null;
        String combineLine = "";
        String word1 = "";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((getLine = bufferedReader.readLine()) != null) {
                //System.out.println(getLine);
                
                combineLine = combineLine+" "+getLine;
            } 
       // System.out.println(combineLine);
        //reverse the string
         for(int i = 0; i<combineLine.length(); i++){
            word1 += combineLine.charAt(i);
        }
        //System.out.println(word1);
        return word1;
    
    }
    
    public static void printFine(String getInput){ 
        String sentence=" ";
        String word = "";
        String word1 = "";
        int count = 0;
        for(int i = 0; i<getInput.length(); i++){
            if (getInput.charAt(i) != ' '){
                word = getInput.charAt(i) + word;
                
            } else {
                for(int j = 0; j< word.length(); j++){
                  word1 = word.charAt(j) + word1;   
            }
               System.out.println(word1);
                //sentence = word + " "+sentence;
                count++;
                word = ""; 
                word1 = ""; 
        }
    }
        
        //count the number of words
        numberOfWords = count; 
       
   }
    
    
    public static void main(String [] args) throws IOException{
       printFine(read("getFile.txt"));
       System.out.println("The number of words is "+ numberOfWords); 
}
}
