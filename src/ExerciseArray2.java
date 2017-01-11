
import javax.swing.JOptionPane;

/*Solution to 
 Write a method that takes an array of non-negative integers x where x>=0 and x<101 with a duplicate
value and returns that duplicate value i.e. when passed [1,2,3,9,3,3,4,1] it returns 3. It returns -1 when
no duplicate is found. without using any class from java.util
 * @author samdwise
 */
public class ExerciseArray2 {
    public static void duplicateArray(int[] arrayParament)
    {
        String duplicate = "";
        //check for duplicate
        for (int i = 0; i < arrayParament.length-1; i++)
        {
            for (int j = i+1; j < arrayParament.length; j++)
            {
                if( (arrayParament[i] == (arrayParament[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+arrayParament[i]);
                    duplicate = "yes";
                } 
            }
        }
            if(duplicate == "yes"){
              System.out.println("");
            }else
                System.out.println(-1);
            //
        //return a;
    }
    
    //method to check that the array element are between 0-101
    public static void checkArray(int[] arrayParament){
        int checkYes = 0;
        int checkNo = 0;
        for(int i= 0; i < arrayParament.length; i++ ){
            if(arrayParament[i] >= 0 && arrayParament[i] < 101){
           // System.out.println("Yes");
                checkYes = 1;
            }else{
                //System.out.println("Yes");
                checkNo = 1;
            }
        }
        if(checkYes == 1 && checkNo == 1 ){
            System.out.println("One or more of your x value if out of range");
        }else{
            duplicateArray(arrayParament);
        }
    //System.out.println(checkYes);
    //System.out.println(checkNo);
    }
    public static void main(String [] args){
        int [] getArray = {3,6,7,9};
        
        //JOptionPane.showInputDialog(args)
        checkArray(getArray);
        //System.out.println(getInfo);
    }
    
}
