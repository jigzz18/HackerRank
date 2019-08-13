import java.io.*;
import java.util.*;

public class Solution {

    public static String reverse(String s){
        return new StringBuffer(s).reverse().toString();    
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(A.equals(reverse(A)) ? "Yes" : "No");
        
    }
}



