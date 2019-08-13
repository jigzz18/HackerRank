import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      try{
          MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
          messageDigest.update(str.getBytes());
          byte[] digest = messageDigest.digest();
          for(byte b : digest)
            System.out.printf("%02x", b);
      }catch(Exception e){}

    }
}

