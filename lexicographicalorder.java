import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s.substring(0,k);
    String largest = s.substring(0,k);

   for(int i=0;i<s.length()-k;i++){
       String s1 = s.substring(i+1, i+k+1);
       if(smallest.compareTo(s1)>0){
           smallest = s1;
       }
       if(largest.compareTo(s1)<0){
           largest = s1;
       }
   }
        
        return smallest + "\n" + largest;
    }