import java.io.*;
import java.util.*;

public class Solution {

    public static String capitalize(String str)
    {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        System.out.println(capitalize(A) + " " + capitalize(B));
        
    }
}



