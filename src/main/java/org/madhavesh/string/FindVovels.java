package org.madhavesh.string;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindVovels {
    public static void main(String[] args)
    {
        findVoles("maddyrai");
        findVolesStreams("maddyrai");

    }
    static void findVoles(String str)
    {
        String vovel="";
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if((str.charAt(i)=='a') || (str.charAt(i)=='e') ||( str.charAt(i)=='i' ) ||(str.charAt(i)=='o') || ( str.charAt(i)=='u'))
            {
             vovel=vovel+str.charAt(i);
             count++;
            }
        }
        System.out.println(vovel);
        System.out.println("total vovels are:"+ count);

    }

    static void  findVolesStreams(String str)
    {
       // Stream.of(Arrays.asList(str.toCharArray())).findAny().toString();
    }
}
