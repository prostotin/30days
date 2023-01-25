import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    static List<List<Integer>> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int sums[] = new int[16]; 
        int counter=0;
        for(int i =0; i< 4; i++){
            for (int j = 0; j < 4; j++){
                sums[counter]=getSum(i,j);
                counter++;
            }
        }
        
        
        Arrays.sort(sums);
         int max= sums[sums.length-1];
      System.out.println(max);
        
 
    }
    
    public static int getSum(int x, int y){
        int sum = 0;
        
        for(int i=0; i<3; i++){
            sum += arr.get(x).get(y+i);
                 
        }
       
        sum+= arr.get(x+1).get(y+1);
        
        for(int i=0; i<3; i++){
            sum += arr.get(x+2).get(y+i);
             
        }          
        return sum;
    }
}
