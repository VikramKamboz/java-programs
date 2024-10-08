package org.madhavesh.string;


import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {

    //reverse a string
   public static String s="maddy";
    public static String s1="maddy rai";

   public static void main(String[] aa)
   {
       //reverseEachWorldNotforReverse();
       reverseEachWorldNotforReverseUsingStreams();

   }
   void reverseWithoutStream()
   {
       StringBuffer b= new StringBuffer(s);
       StringBuffer b1= new StringBuffer(s1);
       //without stream
       System.out.print(b1.reverse().toString());
       System.out.println(b.reverse());
   }

void reverseWithStream()
{
    //reverse each word of string with stream
    String newstring=Stream.of(s1).map((i)-> new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" ")).toString();
    System.out.println(newstring);
}

void reverseEachWorld()
{
    String s1="maddy rai";
    String[] str= s1.split(" ");
    String poststr= Stream.of(str).map((i)-> new StringBuilder(i).reverse()).collect(Collectors.joining(" "));
    System.out.println("     each word reversal  example---"+poststr);
}
    static void reverseEachWorldNotforReverse()
    {
        String s1="reverse maddy rai";
       String[] sp= s1.toLowerCase(Locale.ROOT).split(" ");
       String[] newstr;
       for(int i=0;i<sp.length-1;i++)
       {
           if(sp[i].contentEquals("rev"))
           {
               break;

           }
           else{
               String sub= sp[i];
               String rev="";
                for(int j=sub.length()-1;j>0;j--)
                {
                     rev=rev+ sub.charAt(j);
                }
                sp[i]=rev;
           }

       }
        System.out.println("-------->>>>>"+sp.toString());
        System.out.println("-----using streams--->>>>>"+sp.toString());

    }

    public static void reverseEachWorldNotforReverseUsingStreams()
    {
        String s1="reverse maddy rai";
        String[] str= s1.split(" ");
        String ignore="reverse";
        int index= s1.indexOf("reverse");
        String strmrev=Arrays.stream(str,index+1,str.length).map((i)-> new StringBuilder(i).reverse()).collect(Collectors.joining(" "));
        String reversed=ignore.concat(" ")+strmrev;
        System.out.println("     each word reversal  example---"+reversed);

    }



}
