import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        
        try{
            int i=Integer.parseInt(S);  
            System.out.println(i);
        } catch (NumberFormatException exception){
             System.out.println("Bad String");
        }
    }
}
