import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    
	// Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference(){
        int absoluteDifference = 0;
        maximumDifference = 0;
        for(int i =0; i < elements.length; i++){
            for (int j= 0; j < elements.length; j++){
                absoluteDifference = Math.abs(elements[i] - elements[j]);
                if(absoluteDifference > maximumDifference){
                    maximumDifference = absoluteDifference;
                }
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
