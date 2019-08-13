import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        String[] str=scan.nextLine().trim().split("[ !,?\\._'@]+",0);
        if(str.length==1 && str[0].equals("")){
            System.out.println(0);
        }else{
            System.out.println(str.length);
            for(String s:str)System.out.println(s);
        }
        scan.close();
    }
}

