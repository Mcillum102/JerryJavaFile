package NewTeachFiles;

import java.util.Arrays;

public class arrayLesson {
    
    public static void main(String[] args) {
        
        // String Array
        /* s[0] = 10
         * s[2] = 19
         * ....
         */
       
        // temp varaible/object solution
        // String temp;
        // String[] s = {"four", "score", "and", "seven", "years", "ago"};
        // for(int i = 0; i < s.length - 1; i+=2){
        //     temp = s[i];
        //     s[i] = s[i+1];
        //     s[i+1] = temp;
        // }

        // for(String i : s){
        //     System.out.print(i + ", ");
        // }
        
        int[] numberArray = {1,5,323,6,67,2,4,36,4,23,434,25,34};
        /*  Find the largest number in this array
         *  
         */
        int temp = numberArray[0];
        for(int i = 0; i < numberArray.length; i++){
            if (numberArray[i] > temp){
                temp = numberArray[i];
            }
        }
        System.out.println(temp);
    }
}
