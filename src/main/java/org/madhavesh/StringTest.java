package org.madhavesh;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {

    //reverse a string
   public static String s="maddy";
    public static String s1="maddy rai";

                   // yddam iar



   public static void main(String[] aa)
   {

       StringBuffer b= new StringBuffer(s);
       StringBuffer b1= new StringBuffer(s1);
       System.out.println(b.reverse());

      //without stream
       System.out.print(b1.reverse().toString());


       //reverse each word of string with stream
       String newstring=Stream.of(s1).map((i)-> new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" ")).toString();
       char[] c=s1.toCharArray();
      // Arrays.asList(c).stream().map((j)-> new StringBuilder(j).reverse().toString()).collect(Collectors.joining());
       System.out.println("     stream example---"+newstring);





   }







}
